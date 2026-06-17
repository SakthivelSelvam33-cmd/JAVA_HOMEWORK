package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController 
{
    @Autowired
    private StudentService studentService;




    @PostMapping("/insertData")
    public String saveStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
}
