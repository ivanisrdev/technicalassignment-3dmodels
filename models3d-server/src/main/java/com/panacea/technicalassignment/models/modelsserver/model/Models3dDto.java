package com.panacea.technicalassignment.models.modelsserver.model;

public class Models3dDto {

    private Long models3dId;
    private String models3dName;
    private String models3dPath;

    public Models3dDto() {
    }

    public Models3dDto(Long id, String name, String path) {
        this.models3dId = id;
        this.models3dName = name;
        this.models3dPath = path;
    }

    public Long getId() {
        return models3dId;
    }

    public void setId(Long id) {
        this.models3dId = id;
    }

    public String getName() {
        return models3dName;
    }

    public void setName(String name) {
        this.models3dName = name;
    }

    public String getPath() {
        return models3dPath;
    }

    public void setPath(String path) {
        this.models3dPath = path;
    }

    @Override
    public String toString() {
        return "Models3dDto{" +
                "id=" + models3dId +
                ", name='" + models3dName + '\'' +
                ", path='" + models3dPath + '\'' +
                '}';
    }
}
