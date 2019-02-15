package com.gb.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }
}
