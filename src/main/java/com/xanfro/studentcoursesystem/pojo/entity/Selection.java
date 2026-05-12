package com.xanfro.studentcoursesystem.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@TableName("selection")
public class Selection {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String courseCode;
    private String courseName;
    private String college;
    private String studentNo;
    private String studentName;
}
