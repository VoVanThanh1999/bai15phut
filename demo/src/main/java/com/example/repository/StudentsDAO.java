package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentsDAO extends JpaRepository<Student, Integer>  {

}
