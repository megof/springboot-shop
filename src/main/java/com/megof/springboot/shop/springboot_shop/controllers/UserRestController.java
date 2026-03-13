package com.megof.springboot.shop.springboot_shop.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
//handler maneja peticiones
    @GetMapping("/Rdetails")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Details");
        body.put("name", "Megof");
        body.put("lastname", "Timer");

        body.put("date", "13/03/2026");
        body.put("time", "12:39");
        return body;
    }
    
}
