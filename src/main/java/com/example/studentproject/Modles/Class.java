package com.example.studentproject.Modles;

public class Class {
    private int id;
    private String className;

    public Class(int id, String className) {
        this.id = id;
        this.className = className;
    }

    public Class(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", className='" + className + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
