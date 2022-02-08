package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contact

    List<Contact> list = List.of(
            new Contact(1L, "vishal@gmail.com", "Vishal", 1311L),
            new Contact(2L, "vishu@gmail.com", "vishu", 1311L),
            new Contact(3L, "rajat@gmail.com", "Rajat", 1312L),
            new Contact(4L, "raj@gmail.com", "Raj", 1313L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
