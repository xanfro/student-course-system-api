package com.xanfro.studentcoursesystem.controller;

import com.xanfro.studentcoursesystem.pojo.common.Result;
import com.xanfro.studentcoursesystem.pojo.entity.Course;
import com.xanfro.studentcoursesystem.pojo.entity.Student;
import com.xanfro.studentcoursesystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/course")
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public Result<List<Course>> getCourse(){
        List<Course> courses = courseService.list();
        return Result.success(courses);
    }
}
