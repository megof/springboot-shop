package com.megof.springboot.shop.springboot_shop.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import models.dto.UserDto;


@RestController
@RequestMapping("/api") //path added

public class UserRestController {
//handler maneja peticiones
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Megof", "Timer", 0);

        Map<String, Object> body = new HashMap<>();
        body.put("title", "Details");
        body.put("name", "Megof");
        body.put("lastname", "Timer");

        body.put("date", "13/03/2026");
        body.put("time", "12:39");

        
        body.put("nameu", user.getName());
        body.put("lastnameu", user.getLastname());

        body.put("user", user);
        return body;
    }
    
    
    @GetMapping("/detailsdto")
    public UserDto detailsdto() {
        User user = new User("Megof", "Timer", 0);
        UserDto userdto = new UserDto();

        userdto.setTitle("titledto");
        userdto.setUser(user);

        return userdto;
    }

    @GetMapping("/detailslts")
    public List<User> detailslts() {
        User user = new User("Megof", "Timer", 0);
        User user1 = new User("David", "Ospina", 0);
        User user2 = new User("Juan", "Ortega", 0);

       List<User> users = new ArrayList<>();
       users.add(user);
       users.add(user1);
       users.add(user2);

        return users;
    }

    @GetMapping("/detailsarr")
    public List<User> detailsarr() {
        User user = new User("Megof", "Timer", 0);
        User user1 = new User("David", "Ospina", 0);
        User user2 = new User("Juan", "Ortega", 0);

       List<User> users = Arrays.asList(user, user1, user2); 
       return users;
    }

}
