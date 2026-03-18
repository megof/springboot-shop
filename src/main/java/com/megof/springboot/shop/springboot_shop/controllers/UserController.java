package com.megof.springboot.shop.springboot_shop.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import models.User;
import org.springframework.web.bind.annotation.RequestParam;


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
    
    @GetMapping("/list")
    public String list(ModelMap model) {
        User user = new User("Megof", "Timer", 0);
        User user1 = new User("David", "Ospina", 3);
        User user2 = new User("Juan", "Ortega", 9);

       List<User> users = Arrays.asList(user, user1, user2); 

        model.addAttribute("title", "List");
        model.addAttribute("users", users);
        return "list";
    }
    
}
