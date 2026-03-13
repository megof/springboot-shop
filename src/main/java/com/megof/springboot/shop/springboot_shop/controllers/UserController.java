package com.megof.springboot.shop.springboot_shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
//handler maneja peticiones
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Details");
        model.addAttribute("name", "Megof");
        model.addAttribute("lastname", "Timer");
        return "details";
    }
    
}
