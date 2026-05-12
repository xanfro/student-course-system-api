package com.xanfro.studentcoursesystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xanfro.studentcoursesystem.mapper.StudentMapper;
import com.xanfro.studentcoursesystem.pojo.entity.Student;
import com.xanfro.studentcoursesystem.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {
}
