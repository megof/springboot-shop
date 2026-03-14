package com.megof.springboot.shop.springboot_shop.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import models.User;

@Controller
public class UserController {
//handler maneja peticiones
    @GetMapping("/details")
    public String details(Model model, Map<String, Object> map) {
        
        User user = new User("Megof", "Timer", 0);
        
        model.addAttribute("title", "Details");
        model.addAttribute("name", "Megof");
        model.addAttribute("lastname", "Timer");

        map.put("date", "13/03/2026");
        map.put("time", "12:39");

        map.put("nameu", user.getName());
        map.put("lastnameu", user.getLastname());

        map.put("user", user.toString());
        return "details";
    }
    
}
