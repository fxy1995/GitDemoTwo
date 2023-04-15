package com.duing.vo;

/**
 * @Author 付雪缘
 * @Date 2023/4/13 11:22
 * @Version 1.0
 */
public class FilmVo {
    private String filmId;
    private String name;
    private String director;
    private String player;
    private String imgPath;

    @Override
    public String toString() {
        return "Film{" +
                "filmId='" + filmId + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", player='" + player + '\'' +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }

    public FilmVo() {
    }

    public FilmVo(String filmId, String name, String director, String player, String imgPath) {
        this.filmId = filmId;
        this.name = name;
        this.director = director;
        this.player = player;
        this.imgPath = imgPath;
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

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
