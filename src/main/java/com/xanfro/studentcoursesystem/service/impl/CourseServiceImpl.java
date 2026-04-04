package com.xanfro.studentcoursesystem.service.impl;

import com.xanfro.studentcoursesystem.pojo.entity.Course;
import com.xanfro.studentcoursesystem.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Override
    public List<Course> list() {
        return List.of();
    }
}
