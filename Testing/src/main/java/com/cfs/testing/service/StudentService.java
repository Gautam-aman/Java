package com.cfs.testing.service;


import com.cfs.testing.entity.Student;
import com.cfs.testing.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public List<Student> FindAllStudents(){
        return studentRepo.findAll();
    }

    public Student AddStudent(Student student){
        return studentRepo.save(student);
    }

    public Student deleteStudentById(Long id){
        studentRepo.deleteById(id);
    }

}
