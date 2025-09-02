package org.aman;

public class App {

    public static void main(String[] args) {
        Student student = new Student();
        Course course = new DSA();
        student.setCourse(course);
        student.study();
    }

}
