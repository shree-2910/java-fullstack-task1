package com.example.demo.controller;

import com.example.demo.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ContactController {

    private final ContactRepository repository;

    public ContactController(ContactRepository repository) {
        this.repository = repository;
    }

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

        Contact contact = new Contact();
        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        repository.save(contact);

        return "Form Submitted Successfully!";
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }
}