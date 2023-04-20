package com.shivu.association.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivu.association.domain.Student;

public interface ContactDetailsRepository extends JpaRepository<Student, Long> {

}
