package com.spring.springapp.auth;

import org.springframework.stereotype.Service;

@Service
public class authService {
    
    protected String getHello() {
        return "hello world";
    }

    private String getName(String name) {
        if (name.isEmpty()) {
            return "ERROR: " + name;
        }
        return name;
    }

}
