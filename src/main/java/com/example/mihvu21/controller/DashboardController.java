package com.example.mihvu21.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("userName", "Xin chào");
        model.addAttribute("message", "Chào mừng đến với Dashboard của tôi");
        return "dashboard";
    }
}
