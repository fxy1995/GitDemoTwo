package com.duing.dao;

import com.duing.domain.Film;

import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/15 9:14
 * @Version 1.0
 */
public interface FilmMapper {
    List<Film> findAll();
}
