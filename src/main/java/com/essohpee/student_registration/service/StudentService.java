package com.essohpee.student_registration.service;

import com.essohpee.student_registration.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    void saveStudent(Student student);
    public Student getStudentById(Long id);
    void updateStudent(Student student);
    void deleteStudentById(Long id);
}
