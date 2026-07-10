package com.gridweaver.gridweaver.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getMessage() {
        return "Welcome to GridWeaver Backend!";
    }
}