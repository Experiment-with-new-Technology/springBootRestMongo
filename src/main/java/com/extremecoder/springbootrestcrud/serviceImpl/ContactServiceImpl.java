package com.extremecoder.springbootrestcrud.serviceImpl;

import com.extremecoder.springbootrestcrud.entity.Contact;
import com.extremecoder.springbootrestcrud.repository.ContactRepository;
import com.extremecoder.springbootrestcrud.service.ContactService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact findById(Long id) {
        return contactRepository.findContactById(id);
    }

    @Override
    public Long deleteById(Long id) {
        contactRepository.deleteById(id);
        return id;
    }

    @Override
    public Contact updateContact(Long id, Contact contact) {
        Contact existingContact = contactRepository.findContactById(id);
        if(existingContact != null) {
            BeanUtils.copyProperties(contact, existingContact);
        }
        return contactRepository.save(existingContact);
    }
}
