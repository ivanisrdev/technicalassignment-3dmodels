package com.panacea.technicalassignment.models.modelsserver.model;

import java.io.Serializable;

public class Models3dDto implements Serializable {

    private Long id;
    private String name;
    private String path;

    public Models3dDto() {
    }

    public Models3dDto(Long id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Models3dDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
