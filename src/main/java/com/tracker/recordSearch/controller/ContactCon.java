package com.tracker.recordSearch.controller;

import com.tracker.recordSearch.domain.Contact;
import com.tracker.recordSearch.repository.ContactRepo;
import com.tracker.recordSearch.service.ContactSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ContactCon {

    @Autowired
    private ContactSer contactSer;

    @Autowired
    private ContactRepo contactRepo;

    @GetMapping("/contact")
    public String newContactMessage(Model model){
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "contact";
    }

    @GetMapping("/contact/list")
    public String contactList(Model model) {
        List<Contact> contacts = contactSer.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "dashboard/index";
    }

    @GetMapping("/contact/detail/{id}")
    public String showContactDetail(@PathVariable("id") Long id, Model model){
        Contact contactDetail = contactRepo.findById(id).get();
        model.addAttribute("contactDetail",contactDetail);
        return "dashboard/contactDetails";
    }

    @PostMapping("/contact/save")
    public String saveContact(Contact contact){
        contactSer.saveContact(contact);
        return "redirect:/contact-success";
    }
}
