package com.duing.service.impl;

import com.duing.dao.RoomMapper;
import com.duing.domain.Room;
import com.duing.service.RoomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/17 9:23
 * @Version 1.0
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<Room> selectAll() {
        //获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(1, 2);
//紧跟着的第一个select方法会被分页
        List<Room> list = roomMapper.selectAll();
        PageInfo pageInfo=new PageInfo(list,2);
//        当前页
        System.out.println("pageNum:"+pageInfo.getPageNum());
//        总页数
        System.out.println("pageSize:"+pageInfo.getPageSize());
//        送记录数
        System.out.println("total:"+pageInfo.getTotal());

        return pageInfo.getList();
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Room record) {
        return roomMapper.insert(record);
    }

    @Override
    public int insertSelective(Room record) {
        return 0;
    }

    @Override
    public Room selectByPrimaryKey(Long id) {
        return roomMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Room record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Room record) {
        return 0;
    }

}
