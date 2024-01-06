package com.tracker.recordSearch.service;

import com.tracker.recordSearch.domain.Contact;
import com.tracker.recordSearch.domain.StudentApplication;
import com.tracker.recordSearch.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactSer {

    @Autowired
    private ContactRepo contactRepo;

    public Contact saveContact(Contact contact){
        return contactRepo.save(contact);
    }

    public List<Contact> getAllContacts() {
        return (List<Contact>) contactRepo.findAll();
    }
}
