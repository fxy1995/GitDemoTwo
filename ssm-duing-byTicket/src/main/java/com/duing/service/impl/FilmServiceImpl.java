package com.duing.service.impl;

import com.duing.dao.FilmMapper;
import com.duing.domain.Film;
import com.duing.service.FilmService;
import com.duing.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/15 9:37
 * @Version 1.0
 */
@Service
public class FilmServiceImpl implements FilmService {
     @Autowired
    private FilmMapper filmMapper;
    @Override
    public List<FilmVo> selectList() {
        List<Film> films=filmMapper.findAll();
        List<FilmVo> result=new ArrayList<>();
        for (Film film :films){
            System.out.println("-----"+film.getFilmId()+film.getImgPath());
            result.add(new FilmVo(film.getFilmId(),film.getName(),film.getDirector(),film.getPlayer(),film.getImgPath()));
        }
        return result;
    }
}
