package com.panacea.technicalassignment.models.modelsserver.controller;

import com.panacea.technicalassignment.models.modelsserver.model.Models3d;
import com.panacea.technicalassignment.models.modelsserver.service.Models3dService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/models")
public class Models3dController {

    @Autowired
    Models3dService models3dService;


    // GET ALL MODELS3D
    @GetMapping(value = "/listModels")
    public List<Models3d> listModels3d() {

        return models3dService.getList();
    }

    // GET BY ID MODELS3D
    @GetMapping(value = "/listModels/{id}")
    public Models3d retrieveModels3dById(@PathVariable Long id) {

       Optional<Models3d> models3dOptional = models3dService.getById(id);

       if(!models3dOptional.isPresent())
           throw new NoSuchElementException("id-" + id);

       return models3dOptional.get();
    }

    // CREATE A SINGLE MODELS3D
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/saveModels")
    public void createModel3d(@RequestBody @Valid Models3d models3d) {

       models3dService.create(models3d);
    }

    // UPDATE POST MODELS3D
    @PutMapping("/saveModels/{id}")
    public ResponseEntity<Object> updateModel3d(@RequestBody Models3d models3d, @Valid @PathVariable long id) {

        Optional<Models3d> models3dOptional = models3dService.getById(id);

        if (!models3dOptional.isPresent())
            return ResponseEntity.notFound().build();

        models3d.setId(id);

        models3dService.update(models3d);

        return ResponseEntity.noContent().build();
    }

    // DELETE MODELS3D
    @DeleteMapping("/{id}")
    public void deleteModel3d(@PathVariable @Valid Long id) {

        models3dService.deleteById(id);
    }

}
