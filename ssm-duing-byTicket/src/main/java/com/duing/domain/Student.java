package com.duing.domain;

import java.io.Serializable;

/**
 * @Author 付雪缘
 * @Date 2023/4/8 21:01
 * @Version 1.0
 */
public class Student  implements Serializable {

    private static final long serialVersionUID = 4724114844926445745L;
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    private int age;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
