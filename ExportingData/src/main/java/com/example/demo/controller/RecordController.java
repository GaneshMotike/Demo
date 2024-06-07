package com.example.demo.controller;

import com.example.demo.model.Record;
import com.example.demo.service.RecordService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping
    public String getAllRecords(Model model) {
        List<Record> records = recordService.getAllRecords();
        model.addAttribute("records", records);
        return "records";
    }

    @GetMapping("/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=records.pdf");

        Document document = new Document();
        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();

        List<Record> records = recordService.getAllRecords();
        for (Record record : records) {
            document.add(new Paragraph("ID: " + record.getId()));
            document.add(new Paragraph("Name: " + record.getName()));
            document.add(new Paragraph("Value: " + record.getValue()));
            document.add(new Paragraph(" "));
        }
        
        document.close();
    }

    @GetMapping("/export/excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=records.xlsx");

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Records");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Name");
        header.createCell(2).setCellValue("Value");

        List<Record> records = recordService.getAllRecords();
        int rowNum = 1;
        for (Record record : records) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(record.getId());
            row.createCell(1).setCellValue(record.getName());
            row.createCell(2).setCellValue(record.getValue());
        }

        workbook.write(response.getOutputStream());
        workbook.close();
    }

    @GetMapping("/export/csv")
    public void exportToCSV(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=records.csv");

        List<Record> records = recordService.getAllRecords();
        StringBuilder sb = new StringBuilder();
        sb.append("ID,Name,Value\n");

        for (Record record : records) {
            sb.append(record.getId()).append(",");
            sb.append(record.getName()).append(",");
            sb.append(record.getValue()).append("\n");
        }

        response.getWriter().write(sb.toString());
    }
}
