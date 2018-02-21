package com.yet.spring.core;

public class Client {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Client(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

}
