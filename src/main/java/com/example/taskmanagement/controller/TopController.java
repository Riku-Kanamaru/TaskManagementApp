package com.example.taskmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class TopController {

    @GetMapping("/top")
    public String logout() {
        return "redirect:/login";
    }

   
    
}
