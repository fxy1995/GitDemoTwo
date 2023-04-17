package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 付雪缘
 * @Date 2023/4/17 11:51
 * @Version 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/t12")
    @ResponseBody
    public String hello(){
        return "你在干嘛";
    }
}
