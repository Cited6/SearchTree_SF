package com.keyin.SearchTree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String home() {
        return "enterNumbers"; // Assuming enterNumbers.html is in templates folder
    }
}

