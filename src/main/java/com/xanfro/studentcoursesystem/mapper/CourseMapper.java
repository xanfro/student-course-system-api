package com.xanfro.studentcoursesystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xanfro.studentcoursesystem.pojo.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}
