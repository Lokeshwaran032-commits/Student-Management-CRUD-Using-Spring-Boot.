package com.Student_Management.SM_System.Service;

import com.Student_Management.SM_System.Model.Student;
import com.Student_Management.SM_System.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    // CREATE
    public Student addStudent(Student student) {
        return repo.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // READ BY ID
    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    // UPDATE
    public Student updateStudent(int id, Student student) {
        if (repo.existsById(id)) {
            student.setId(id);
            return repo.save(student);
        }
        return null;
    }

    // DELETE
    public String deleteStudent(int id) {
        repo.deleteById(id);
        return "Deleted successfully";
    }
}