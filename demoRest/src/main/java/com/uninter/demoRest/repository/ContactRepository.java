package com.uninter.demoRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uninter.demoRest.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository <Contact, Long>{

}
