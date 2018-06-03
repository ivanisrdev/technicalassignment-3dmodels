package com.panacea.technicalassignment.models.modelsserver.dao;


import com.panacea.technicalassignment.models.modelsserver.model.Models3d;
import com.panacea.technicalassignment.models.modelsserver.model.Models3dDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Models3dMapper {

    Models3dDto entityToDto(Models3d entity);
    List<Models3dDto> entityListToDtoList(List<Models3d> entityList);
    Models3d dtoToEntity(Models3dDto dto);
    List<Models3d> dtoListToEntityList(List<Models3dDto> dtoList);
}
