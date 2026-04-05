package com.xanfro.studentcoursesystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xanfro.studentcoursesystem.mapper.CourseMapper;
import com.xanfro.studentcoursesystem.pojo.entity.Course;
import com.xanfro.studentcoursesystem.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper,Course> implements CourseService {
}
