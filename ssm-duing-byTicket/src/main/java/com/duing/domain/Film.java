package com.duing.domain;

import java.util.Date;

/**
 * @Author 付雪缘
 * @Date 2023/4/15 9:10
 * @Version 1.0
 */
public class Film {
    private long id;
    private String filmId;
    private String name;
    private String director;
    private String player;
    private  String type;
    private String country;
    private String synopsis;
    private int length;
    private Date playTime;
    private String imgPath;

    public Film() {
    }

    public Film(long id, String filmId, String name, String director, String player, String type, String country, String synopsis, int length, Date playTime, String imgPath) {
        this.id = id;
        this.filmId = filmId;
        this.name = name;
        this.director = director;
        this.player = player;
        this.type = type;
        this.country = country;
        this.synopsis = synopsis;
        this.length = length;
        this.playTime = playTime;
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", filmId='" + filmId + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", player='" + player + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", length=" + length +
                ", playTime=" + playTime +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
