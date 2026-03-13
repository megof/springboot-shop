package com.megof.springboot.shop.springboot_shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
//handler maneja peticiones
    @GetMapping("/details")
    public String details() {
        return "details";
    }
    
}
