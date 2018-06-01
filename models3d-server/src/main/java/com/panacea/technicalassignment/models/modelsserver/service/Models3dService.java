package com.panacea.technicalassignment.models.modelsserver.service;


import com.panacea.technicalassignment.models.modelsserver.model.Models3d;

import java.util.List;
import java.util.Optional;

public interface Models3dService {

    List<Models3d> getList();

    Optional<Models3d> getById(long id);

    void create(Models3d models3d);

    Models3d update(Models3d model);

    void deleteById(Long id);

}
