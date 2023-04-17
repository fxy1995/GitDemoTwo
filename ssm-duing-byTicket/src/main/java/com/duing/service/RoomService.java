package com.duing.service;

import com.duing.domain.Room;

import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/17 9:21
 * @Version 1.0
 */
public interface RoomService {
    List<Room> selectAll();
    int deleteByPrimaryKey(Long id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}
