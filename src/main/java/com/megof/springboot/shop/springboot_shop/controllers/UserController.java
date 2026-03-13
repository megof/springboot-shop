package com.megof.springboot.shop.springboot_shop.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
//handler maneja peticiones
    @GetMapping("/details")
    public String details(Model model, Map<String, Object> map) {
        model.addAttribute("title", "Details");
        model.addAttribute("name", "Megof");
        model.addAttribute("lastname", "Timer");

        map.put("date", "13/03/2026");
        map.put("time", "12:39");
        return "details";
    }
    
}
