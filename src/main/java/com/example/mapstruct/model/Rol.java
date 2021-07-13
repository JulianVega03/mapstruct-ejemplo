package com.example.mapstruct.model;

public class Rol {

    private Long id;
    private String name;

    public Rol(String t) {
        this.name = t;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
