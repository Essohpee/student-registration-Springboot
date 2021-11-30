package com.essohpee.student_registration.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String gender;
    private LocalDate date;
    private String phoneNumber;
    private String email;

    public Student() {

    }

    public Student( long id, String name,String gender, LocalDate date,
                    String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.phoneNumber= phoneNumber;
        this.email = email;
    }

    public Student(String name,String gender, String email,
                   String phoneNumber, LocalDate date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.phoneNumber= phoneNumber;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

     