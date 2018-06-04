package com.panacea.technicalassignment.models.modelsserver.service;

import com.panacea.technicalassignment.models.modelsserver.dao.Models3dRepository;
import com.panacea.technicalassignment.models.modelsserver.model.Models3d;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Models3dServiceImpl implements Models3dService{

    private final static Log _log = LogFactory.getLog(Models3dServiceImpl.class);

    @Autowired
    Models3dRepository models3DRepository;

    public List<Models3d> findAll() { return models3DRepository.findAll(); }

    public Optional<Models3d> findById(long id) { return models3DRepository.findById(id); }

    public void save(Models3d models3d) { models3DRepository.save(models3d);}

    public Models3d update(Models3d model) {
        return models3DRepository.save(model);
    }

    public void deleteById(Long id) {
        models3DRepository.deleteById(id);
    }
}


