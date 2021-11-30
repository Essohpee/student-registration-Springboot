package com.essohpee.student_registration;

import com.essohpee.student_registration.entity.Student;
import com.essohpee.student_registration.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student samuel = new Student(
                    1,
                    "Samuel Overs Pelham",
                    "Male",
                    LocalDate.of( 1993, 2,24),
                    "+231-776-547-717",
                    "sopelham@gmail.com");
            repository.saveAll(
                    List.of(samuel)
            );
        };
    }
}
