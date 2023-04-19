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
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/t12")
    @ResponseBody
    public String hello(){
        return "你在干嘛";
    }
    @RequestMapping("/test1")
    public String test1(){
        return "/jsp/test";
    }
//    forward 关键字标识请求转发 如果我们例如 test1 我们是返回jsp页面就不能加forward关键字
//   注意请求转发是controller的全路径 如类上写了
//    @RequestMapping("test")
//    controller接口上又写了
//    @RequestMapping("/test3")
//    此时我们想转发给test3 就得return "forward:/test/test3";
    @RequestMapping("/test4")
    public String test4(){
        return "forward:/test/test3";
    }
    @RequestMapping("/test3")
    @ResponseBody
    public String test3(){
        return "this is test3";
    }
}
