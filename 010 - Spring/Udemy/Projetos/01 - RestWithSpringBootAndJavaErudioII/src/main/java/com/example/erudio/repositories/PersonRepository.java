package com.example.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.erudio.model.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
