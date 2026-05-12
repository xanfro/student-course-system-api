package com.xanfro.studentcoursesystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xanfro.studentcoursesystem.mapper.SelectionMapper;
import com.xanfro.studentcoursesystem.pojo.entity.Selection;
import com.xanfro.studentcoursesystem.service.SelectionService;
import org.springframework.stereotype.Service;

@Service
public class SelectionServiceImpl extends ServiceImpl<SelectionMapper,Selection> implements SelectionService {
}
