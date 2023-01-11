package com.example.ContactList.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ContactList.domain.Contacts;
import com.example.ContactList.domain.ContactsRepository;

@Controller
public class ContactsController {

	@Autowired
	private ContactsRepository crepository;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value= {"/getContacts"})
	public @ResponseBody List<Contacts> getContacts() {
		return (List<Contacts>) crepository.findAll();
	}
}
