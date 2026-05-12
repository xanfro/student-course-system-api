package com.xanfro.studentcoursesystem.controller;

import com.xanfro.studentcoursesystem.pojo.common.Result;
import com.xanfro.studentcoursesystem.pojo.entity.Selection;
import com.xanfro.studentcoursesystem.service.CourseService;
import com.xanfro.studentcoursesystem.service.SelectionService;
import com.xanfro.studentcoursesystem.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/selection")
@RestController
public class SelectionController {

    @Autowired
    private SelectionService selectionService;
    
    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping
    public Result<List<Selection>> getSelections(){
        List<Selection> selections = selectionService.list();
        return Result.success(selections);
    }

    @PostMapping
    public Result<Boolean> addSelection(@RequestBody Selection selection){
        boolean studentExists = studentService.query().eq("name", selection.getStudentName()).exists();
        if (!studentExists) {
            return Result.error("学生不存在");
        }

        boolean courseExists = courseService.query().eq("name", selection.getCourseName()).exists();
        if (!courseExists) {
            return Result.error("课程不存在");
        }

        Boolean res = selectionService.save(selection);
        return Result.success(res);
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> deleteSelection(@PathVariable Integer id){
        Boolean res = selectionService.removeById(id);
        return Result.success(res);
    }
}
