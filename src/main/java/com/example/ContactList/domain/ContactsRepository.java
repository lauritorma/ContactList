package com.example.ContactList.domain;

import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Contacts, Long>{
	
}