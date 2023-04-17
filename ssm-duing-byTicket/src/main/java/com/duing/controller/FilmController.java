package com.duing.controller;

import com.duing.service.FilmService;
import com.duing.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/15 9:43
 * @Version 1.0
 */
@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;
    @RequestMapping("findAllFilm")

    public String findAll(Model model, HttpServletRequest request){

        model.addAttribute("filmVoList",filmService.selectList());
        return "jsp/filmList";
    }
//    注意在ssm整合中不能加forward关键字-系统默认就是请求转发
    @RequestMapping("/t2")
    public String testLogin(){
        return "jsp/test";
    }
//    注意从定向如果你不写http://xxxxxxx 默认就是访问当前项目中的资源
//    所以访问的还是controller资源
    @RequestMapping("/t3")
    public String testLogin1(){
        return "redirect:t2";
    }
    @RequestMapping("/t4")
    public String testLogin2(){
        return "redirect:http://www.baidu.com";
    }
}
