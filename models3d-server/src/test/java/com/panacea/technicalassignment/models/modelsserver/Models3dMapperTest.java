package com.panacea.technicalassignment.models.modelsserver;

import com.panacea.technicalassignment.models.modelsserver.dao.Models3dMapper;
import com.panacea.technicalassignment.models.modelsserver.model.Models3d;
import com.panacea.technicalassignment.models.modelsserver.model.Models3dDto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;

public class Models3dMapperTest {

    private final static Log _log = LogFactory.getLog(Models3dMapperTest.class);
    private Models3dMapper mapper = Mappers.getMapper(Models3dMapper.class);

        @Test
        public void entityToDtoMapperTest() {
            Models3d models3d = new Models3d();
            models3d.setId(1000L);
            models3d.setName("Models3dTest");
            models3d.setPath("/pathtest");

            Models3dDto models3dDto = mapper.entityToDto(models3d);

            assertEquals(models3d.getId(), models3dDto.getId());
            assertEquals(models3d.getName(), models3dDto.getName());
            assertEquals(models3d.getPath(), models3dDto.getPath());
        }
        @Test
        public void dtoToEntityMapperTest() {
            Models3dDto models3dDto = new Models3dDto();
            models3dDto.setId(20000L);
            models3dDto.setName("Models3dDtoTest");
            models3dDto.setPath("/pathDtoTest");

            Models3d models3d = mapper.dtoToEntity(models3dDto);

            assertEquals(models3dDto.getId(), models3d.getId());
            assertEquals(models3dDto.getName(), models3d.getName());
            assertEquals(models3dDto.getPath(), models3d.getPath());
        }
}
