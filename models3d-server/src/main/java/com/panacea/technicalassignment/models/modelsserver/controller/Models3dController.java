package com.panacea.technicalassignment.models.modelsserver.controller;

import com.panacea.technicalassignment.models.modelsserver.dao.Models3dMapper;
import com.panacea.technicalassignment.models.modelsserver.model.Models3d;
import com.panacea.technicalassignment.models.modelsserver.model.Models3dDto;
import com.panacea.technicalassignment.models.modelsserver.service.Models3dService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/models3d")
public class Models3dController {

    private final static Log _log = LogFactory.getLog(Models3dController.class);

    @Autowired
    Models3dService models3dService;

    @Autowired
    Models3dMapper models3dMapper;

    // GET ALL MODELS3D
    @GetMapping(value = "/allModels3d")
    public List<Models3dDto> allModels3d() {

        _log.debug("----> Executed listAllModels3d <---- ");
        List<Models3dDto> models3dDtoList = models3dMapper.entityListToDtoList(models3dService.findAll());
        return models3dDtoList;
    }

    // GET BY ID MODELS3D
    @GetMapping(value = "/{id}")
    public Models3dDto retrieveModels3dById(@PathVariable Long id) {

        _log.debug("----> Executed retrieveModels3dById <---- ");
       Models3dDto models3dDto = models3dMapper.entityOptionalToDto(models3dService.findById(id));
       if(models3dDto.getId() == null)
           throw new NoSuchElementException("id-" + id);

       return models3dDto;
    }

    // CREATE A SINGLE MODELS3D
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/models3d")
    public void saveModel3d(@RequestBody @Valid Models3dDto models3dDto) {

        _log.debug("----> Executed saveModel3d <---- ");
        Models3d models3d = models3dMapper.dtoToEntity(models3dDto);
       models3dService.save(models3d);
    }

    // UPDATE POST MODELS3D
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateModel3dById(@RequestBody Models3dDto models3dDto, @Valid @PathVariable long id) {

        _log.debug("----> Executed updateModel3dById <---- ");
        Models3d models3d = models3dMapper.dtoToEntity(models3dDto);

        if (models3d.getId() != id)
            return ResponseEntity.notFound().build();

        models3dService.update(models3d);
        return ResponseEntity.noContent().build();
    }

    // DELETE MODELS3D
    @DeleteMapping("/{id}")
    public void deleteModel3dById(@PathVariable @Valid Long id) {

        _log.debug("----> Executed deleteModel3dById <---- ");
        models3dService.deleteById(id);
    }

}
