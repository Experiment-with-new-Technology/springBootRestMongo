package com.extremecoder.springbootrestcrud.serviceImpl;

import com.extremecoder.springbootrestcrud.entity.Contact;
import com.extremecoder.springbootrestcrud.service.ContactService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    public List<Contact> contactList = new ArrayList<>();

    @Override
    public Contact saveContact(Contact contact) {
        contactList.add(contact);
        return contact;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactList;
    }

    @Override
    public Contact findById(Long id) {
        return contactList.stream().filter(contact -> contact.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Long deleteById(Long id) {
        contactList.removeIf(contact -> contact.getId().equals(id));
        return id;
    }

    @Override
    public Contact updateContact(Long id, Contact contact) {
        Contact existingContact = contactList.stream().filter(contactItem -> contactItem.getId().equals(id)).findAny().orElse(null);
        if(existingContact != null) {
            int index = contactList.indexOf(existingContact);
            BeanUtils.copyProperties(contact, existingContact);
            contactList.set(index, existingContact);
        }
        return existingContact;
    }
}
