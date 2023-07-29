package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake contact list
    private List<Contact> contacts = List.of(
            new Contact(1L, "akd1@gmail.com", "AKD1",1311L),
            new Contact(2L, "akd2@gmail.com", "AKD2",1311L),
            new Contact(3L, "akd3@gmail.com", "AKD3",1312L),
            new Contact(4L, "akd4@gmail.com", "AKD4",1314L)
    ) ;

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return this.contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList()) ;
    }
}
