package org.example;

public class Student {

    private Course course;



    public void study(){
        int start = course.enroll();
        if (start >= 1) {
            System.out.println("Journey Started");
        }
        else{
            System.out.println("Journey Not Started");
        }

    }

    public Student(Course course) {
        this.course = course;
    }
}
