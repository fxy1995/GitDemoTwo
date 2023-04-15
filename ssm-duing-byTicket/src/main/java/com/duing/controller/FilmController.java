package com.duing.controller;

import com.duing.service.FilmService;
import com.duing.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    public String findAll(Model model){
        model.addAttribute("filmVoList",filmService.selectList());
        return "jsp/filmList";
    }
}
