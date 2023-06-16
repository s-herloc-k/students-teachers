package com.sherlock.laba4.repository;

import com.sherlock.laba4.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
