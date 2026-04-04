package com.xanfro.studentcoursesystem.service.impl;

import com.xanfro.studentcoursesystem.pojo.entity.Student;
import com.xanfro.studentcoursesystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> list() {
        Student xanfro = new Student(1,"向非洲", 18, "男", "软件工程", "大三", "3.5");
        Student xiaosi = new Student(2,"陈俐宏", 18, "女", "软件工程", "大三", "3.5");
        return List.of(xanfro,xiaosi);
    }
}
