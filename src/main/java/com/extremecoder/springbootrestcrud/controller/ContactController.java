package com.extremecoder.springbootrestcrud.controller;

import com.extremecoder.springbootrestcrud.entity.Contact;
import com.extremecoder.springbootrestcrud.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/contact/{id}")
    public Contact findById(@PathVariable("id") Long id) {
        return contactService.findById(id);
    }

    @PostMapping("/contact")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

    @PutMapping("/contact/{id}")
    public Contact updateContact(@PathVariable("id") Long id, @RequestBody Contact contact) {
        return contactService.updateContact(id, contact);
    }

    @DeleteMapping("/contact/{id}")
    public long deleteById(@PathVariable("id") Long id) {
        return contactService.deleteById(id);
    }
}
