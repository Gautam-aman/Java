package org.example;

public class App {
    public static void main(String[] args) {
        Course course = new DSA() ;
        Student aman = new Student(course);
        // Injection




        aman.study();
    }
}

