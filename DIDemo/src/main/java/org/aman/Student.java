package org.aman;

public class Student {

    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(){
        int start = course.enroll();
        if (start >= 1){
            System.out.println("course started");
        }
        else{
            System.out.println("course not started");
        }
    }

}
