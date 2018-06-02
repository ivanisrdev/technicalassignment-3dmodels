package com.panacea.technicalassignment.models.modelsserver.dao;


import com.panacea.technicalassignment.models.modelsserver.model.Models3d;
import com.panacea.technicalassignment.models.modelsserver.model.Models3dDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface Models3dMapper {

    @Mappings({
            @Mapping(target="models3dId", source="entity.id"),
            @Mapping(target="models3dName", source="entity.name"),
            @Mapping(target="models3dPath", source="entity.path")
    })
    Models3dDto entityToDto(Models3d entity);
    @Mappings({
            @Mapping(target="id", source="dto.models3dId"),
            @Mapping(target="name", source="dto.models3dName"),
            @Mapping(target="path", source="dto.models3dPath")
    })
    Models3d dtoToEntity(Models3dDto dto);
}
