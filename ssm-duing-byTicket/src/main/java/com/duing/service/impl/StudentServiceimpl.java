package com.duing.service.impl;

import com.duing.dao.StudentDao;
import com.duing.domain.Student;
import com.duing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/8 21:06
 * @Version 1.0
 */
@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    public StudentDao studentDao;
    @Override
    public List<Student> selectList() {
        return studentDao.selectList();
    }
}
