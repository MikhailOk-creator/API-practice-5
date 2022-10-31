package com.example.apipractice5.repository;

import com.example.apipractice5.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {

}
