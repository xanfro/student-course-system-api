package com.xanfro.studentcoursesystem.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    // 添加属性{ id: 1, name: '张三', age: 20, gender: '男', major: '计算科学', grade: '大三', gpa: 3.5 },
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String major;
    private String grade;
    private String classroom;
}
