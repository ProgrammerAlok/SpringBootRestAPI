package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alok = new Student(
                        "Alok Paul",
                        "alok@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 1)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 1)
            );

            repository.saveAll(
                    List.of(alok, alex)
            );
        };
    }
}
