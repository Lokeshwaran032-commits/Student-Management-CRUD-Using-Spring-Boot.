package com.Student_Management.SM_System.Controller;

import com.Student_Management.SM_System.Model.Student;
import com.Student_Management.SM_System.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/students")
    public class StudentController {

        private final StudentService service;

        public StudentController(StudentService service) {
            this.service = service;
        }

        // ✅ CREATE
        @PostMapping("AddStudent")
        public Student addStudent(@RequestBody Student student) {
            return service.addStudent(student);
        }

        // ✅ READ ALL
        @GetMapping
        public List<Student> getAllStudents() {
            return service.getAllStudents();
        }

        // ✅ READ BY ID
        @GetMapping("/{id}")
        public Student getStudent(@PathVariable int id) {
            return service.getStudentById(id);
        }

        // ✅ UPDATE
        @PutMapping("/{id}")
        public Student updateStudent(@PathVariable int id,
                                     @RequestBody Student student) {
            return service.updateStudent(id, student);
        }

        // ✅ DELETE
        @DeleteMapping("/{id}")
        public String deleteStudent(@PathVariable int id) {
            return service.deleteStudent(id);
        }
    }

