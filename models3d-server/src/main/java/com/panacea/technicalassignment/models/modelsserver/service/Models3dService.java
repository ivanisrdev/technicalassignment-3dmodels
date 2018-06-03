package com.panacea.technicalassignment.models.modelsserver.service;


import com.panacea.technicalassignment.models.modelsserver.model.Models3d;

import java.util.List;

public interface Models3dService {

    List<Models3d> findAll();

    Models3d findById(long id);

    void save(Models3d models3d);

    Models3d update(Models3d model);

    void deleteById(Long id);

}
