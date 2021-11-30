package com.essohpee.student_registration.controller;

import com.essohpee.student_registration.entity.Student;
import com.essohpee.student_registration.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Studentcontroller {

    private final StudentService studentService;
    public Studentcontroller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
     studentService.saveStudent(student);
     return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model){
         Student existingStudent = studentService.getStudentById(id);
         existingStudent.setId(student.getId());
         existingStudent.setName(student.getName());
         existingStudent.setGender(student.getGender());
         existingStudent.setDate(student.getDate());
         existingStudent.setPhoneNumber(student.getPhoneNumber());
         existingStudent.setEmail(student.getEmail());
         studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
                 studentService.deleteStudentById(id);
        return"redirect:/students";
    }
}

