package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //has to be instantiated
public class StudentService {
    public List<String> getStudents( ) {
        return List.of(
                new Student(1L,"Maria","maria@sexy.com", LocalDate.of(2000, Month.JUNE,4),21).toString()
        );
    }
}
