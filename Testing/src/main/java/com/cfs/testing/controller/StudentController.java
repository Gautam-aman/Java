package com.cfs.testing.controller;


import com.cfs.testing.entity.Student;
import com.cfs.testing.repo.StudentRepo;
import com.cfs.testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents(){
         return studentService.FindAllStudents();
    }

    @PostMapping
    public Student createStudent(Student student){
        return studentService.AddStudent(student);
    }

    @DeleteMapping("/{id}")
    public void DeleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }









}
