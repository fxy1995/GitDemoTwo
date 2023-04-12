package com.duing.dao;

import com.duing.domain.Student;


import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/8 20:59
 * @Version 1.0
 */

public interface StudentDao {
     List<Student> selectList();
}
