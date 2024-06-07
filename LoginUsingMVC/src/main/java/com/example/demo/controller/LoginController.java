package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.UserService;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam("userid") String userid, @RequestParam("password") String password) {
        if (userService.authenticate(userid, password)) {
            return new ModelAndView("redirect:/success");
        } else {
            ModelAndView mav = new ModelAndView("login");
            mav.addObject("error", "Invalid username or password");
            return mav;
        }
    }

    @GetMapping("/success")
    public ModelAndView loginSuccess() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Login Successful");
        mav.setViewName("success");
        return mav;
    }
}
