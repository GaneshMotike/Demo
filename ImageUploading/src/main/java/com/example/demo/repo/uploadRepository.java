package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Images;

public interface uploadRepository extends JpaRepository<Images, Integer> {

}
