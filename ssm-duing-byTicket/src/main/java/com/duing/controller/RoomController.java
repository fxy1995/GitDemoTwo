package com.duing.controller;

import com.duing.domain.Room;
import com.duing.service.RoomService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author 付雪缘
 * @Date 2023/4/17 9:35
 * @Version 1.0
 */
@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;
    @RequestMapping("/roomList")
    @ResponseBody
    public List<Room> selectAll(){
        return roomService.selectAll();
    }
    @RequestMapping("/roomInsert")
    @ResponseBody
    public int insertRoom(){
        int [][] situation=new int[3][5];
        Gson gson=new Gson();
       String situationStr= gson.toJson(situation);
        return roomService.insert(new Room(1L,"003","漠河舞厅",situationStr));
    }

}
