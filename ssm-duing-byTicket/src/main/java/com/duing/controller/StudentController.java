package com.duing.controller;

import com.duing.domain.Student;
import com.duing.service.StudentService;
import com.duing.service.StudentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/8 20:58
 * @Version 1.0
 */
@Controller
public class StudentController {
    @Autowired
  public StudentService serviceimpl;
    @RequestMapping("test")
    @ResponseBody
    public List<Student> selectList(){
        return serviceimpl.selectList();
    }
}
