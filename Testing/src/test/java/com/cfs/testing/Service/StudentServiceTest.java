package com.cfs.testing.Service;


import com.cfs.testing.entity.Student;
import com.cfs.testing.repo.StudentRepo;
import com.cfs.testing.service.StudentService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentServiceTest {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentService studentService;

    @BeforeEach
    void setup(){
        studentRepo.deleteAll();
    }

    @Test
    @Order(1)
    public void shouldAddStudentSuccessfully(){
        Student student = new Student(null, "Aman" , "Aman@gmail.com" , "1");
        Student saved = studentService.AddStudent(student);
        Assertions.assertNotNull(saved.getId());
        Assertions.assertNotNull(saved.getName());
        Assertions.assertNotNull(saved.getEmail());
        Assertions.assertEquals(saved.getName(), student.getName());


    }

    @Test
    @Order(2)
    public void shouldFetchStudentSuccessfully(){
        Student student = new Student(null, "Aman" , "Aman@gmail.com" , "1");
        Student student2 = new Student(null, "Kishan" , "Kisan@gmail.com" , "1");
        Student student3 = new Student(null, "hey" , "Aje@.com" , "1");
        Student saved = studentService.AddStudent(student);
        Student saved2 = studentService.AddStudent(student2);
        Student saved3 = studentService.AddStudent(student3);


        List<Student> students = studentService.FindAllStudents();
        Assertions.assertEquals(3, students.size());


    }



}
