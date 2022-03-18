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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student s1=new Student("Maria","maria@sexy.com", LocalDate.of(2000, Month.JUNE,4) );
            Student s2=new Student("Babita","Babita@boobalicous.com", LocalDate.of(2000, Month.JUNE,4) );
            repository.saveAll(
                    List.of(s1,s2)
            );
        };
    }
}
