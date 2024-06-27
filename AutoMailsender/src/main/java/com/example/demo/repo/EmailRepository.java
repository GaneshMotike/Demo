package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
