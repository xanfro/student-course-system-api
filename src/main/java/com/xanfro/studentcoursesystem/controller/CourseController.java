package com.xanfro.studentcoursesystem.controller;

import com.xanfro.studentcoursesystem.pojo.common.Result;
import com.xanfro.studentcoursesystem.pojo.entity.Course;
import com.xanfro.studentcoursesystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Result<Boolean> addCourse(@RequestBody Course course){
        Boolean res = courseService.save(course);
        return Result.success(res);
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> deleteCourse(@PathVariable Integer id){
        Boolean res = courseService.removeById(id);
        return Result.success(res);
    }

    @DeleteMapping()
    public Result<Boolean> deleteCourseByIds(@RequestBody List<Integer> ids){
        Boolean res = courseService.removeByIds(ids);
        return Result.success(res);
    }
}
