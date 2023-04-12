package com.duing.service;

import com.duing.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/8 20:58
 * @Version 1.0
 */

public interface StudentService {
    List<Student> selectList();
}
