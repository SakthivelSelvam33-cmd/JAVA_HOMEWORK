package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
    @Autowired
    private StudentRepository studentRepository;

    

    public String addStudent(Student student)
    {
            int res = studentRepository.insertStudent(student);

            if(res>0)
            {
                return "Student Inserted Successfully.";
            }

            else
            {
                return "Insertion Faild";
            }
    }
}
