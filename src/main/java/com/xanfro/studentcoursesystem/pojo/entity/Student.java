package com.xanfro.studentcoursesystem.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@TableName("student")
public class Student {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String major;
    private String grade;
    private Double gpa;
}
