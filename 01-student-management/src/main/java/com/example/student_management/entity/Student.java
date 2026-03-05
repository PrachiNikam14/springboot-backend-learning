package com.example.student_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String course;

    public Student(
            String name,
            String email,
            String course
    ){
        this.name = name;
        this.email = email;
        this.course = course;
    }
    public Student(){}



}
