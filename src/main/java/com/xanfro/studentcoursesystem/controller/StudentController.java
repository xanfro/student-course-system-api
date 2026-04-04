package com.xanfro.studentcoursesystem.controller;

import com.xanfro.studentcoursesystem.pojo.common.Result;
import com.xanfro.studentcoursesystem.pojo.entity.Student;
import com.xanfro.studentcoursesystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Result<List<Student>> getStudents(){
        List<Student> students = studentService.list();
        return Result.success(students);
    }
}
