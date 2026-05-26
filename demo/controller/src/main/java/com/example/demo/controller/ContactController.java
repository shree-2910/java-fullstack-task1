package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ContactController {

    @GetMapping("/contact")
    public String hello() {
        return "Backend Working";
    }

    @PostMapping("/contact")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ) {

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        return "Form Submitted Successfully!";
    }

}