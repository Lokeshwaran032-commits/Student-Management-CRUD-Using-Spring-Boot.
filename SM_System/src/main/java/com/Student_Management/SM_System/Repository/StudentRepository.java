package com.Student_Management.SM_System.Repository;

import com.Student_Management.SM_System.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}