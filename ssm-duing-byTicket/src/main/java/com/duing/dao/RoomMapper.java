package com.duing.dao;

import com.duing.domain.Room;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    List<Room> selectAll();
}