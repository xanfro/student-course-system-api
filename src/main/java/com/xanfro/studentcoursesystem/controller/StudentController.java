package com.xanfro.studentcoursesystem.controller;

import com.xanfro.studentcoursesystem.pojo.common.Result;
import com.xanfro.studentcoursesystem.pojo.entity.Student;
import com.xanfro.studentcoursesystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Result<Boolean> addCourse(@RequestBody Student student){
        Boolean res = studentService.save(student);
        return Result.success(res);
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> deleteCourse(@PathVariable Integer id){
        Boolean res = studentService.removeById(id);
        return Result.success(res);
    }

    @DeleteMapping()
    public Result<Boolean> deleteCourseByIds(@RequestBody List<Integer> ids){
        Boolean res = studentService.removeByIds(ids);
        return Result.success(res);
    }
}
