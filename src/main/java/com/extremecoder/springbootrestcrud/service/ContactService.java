package com.extremecoder.springbootrestcrud.service;

import com.extremecoder.springbootrestcrud.entity.Contact;

import java.util.List;

public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> getAllContacts();
    Contact findById(Long id);
    Long deleteById(Long id);
    Contact updateContact(Long id, Contact contact);
}
