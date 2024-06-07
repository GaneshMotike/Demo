package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String userid, String password) {
        User user = userRepository.findByUseridAndPassword(userid, password);
        return user != null;
    }
}
