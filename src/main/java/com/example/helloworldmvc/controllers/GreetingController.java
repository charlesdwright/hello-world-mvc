package com.example.helloworldmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="variable",required=false,
            defaultValue = "Earthling") String variable, Model model) {
        model.addAttribute("variable", variable);
        return "greeting";
    }
}
