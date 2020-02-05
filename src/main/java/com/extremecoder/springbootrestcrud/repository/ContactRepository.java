package com.extremecoder.springbootrestcrud.repository;

import com.extremecoder.springbootrestcrud.entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, Long> {
    Contact findContactById(Long id);
}
