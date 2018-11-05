package com.loiane.springcloudhello.repository;

import com.loiane.springcloudhello.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
