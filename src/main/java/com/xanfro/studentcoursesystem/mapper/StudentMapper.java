package com.xanfro.studentcoursesystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xanfro.studentcoursesystem.pojo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
