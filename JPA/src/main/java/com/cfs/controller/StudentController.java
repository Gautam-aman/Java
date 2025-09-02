package com.cfs.controller;

import com.cfs.entity.Student;
import com.cfs.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepo studentrepo;

    public StudentController(StudentRepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    @PostMapping
    public Student createstudent(@RequestBody Student student){
        return studentrepo.save(student);
    }

    @GetMapping
    public List<Student> getstudents(){
        return studentrepo.findAll();
    }

}
