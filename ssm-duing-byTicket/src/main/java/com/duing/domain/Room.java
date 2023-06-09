package com.duing.domain;

public class Room {
    private Long id;

    private String roomId;

    private String roomName;

    private String situation;

    public Room() {
    }

    public Room(Long id, String roomId, String roomName, String situation) {
        this.id = id;
        this.roomId = roomId;
        this.roomName = roomName;
        this.situation = situation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}