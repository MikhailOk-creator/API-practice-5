package ru.rtu_mirea.api_practice_5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rtu_mirea.api_practice_5.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long> {

}
