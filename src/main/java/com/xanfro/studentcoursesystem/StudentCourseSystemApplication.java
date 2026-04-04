package com.xanfro.studentcoursesystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class StudentCourseSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentCourseSystemApplication.class, args);
        log.info("服务开始了开始了！！！！！！！！！！");
    }

}
