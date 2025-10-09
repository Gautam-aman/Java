package com.cfs.testing.service;


import com.cfs.testing.entity.Student;
import com.cfs.testing.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> FindAllStudents(){
        return studentRepo.findAll();
    }

    public Student AddStudent(Student student){
        return studentRepo.save(student);
    }

    public void deleteStudentById(Long id){
         studentRepo.deleteById(id);
    }

}
