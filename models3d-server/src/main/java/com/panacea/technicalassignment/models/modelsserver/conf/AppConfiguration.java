package com.panacea.technicalassignment.models.modelsserver.conf;

import com.panacea.technicalassignment.models.modelsserver.dao.Models3dMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Models3dMapper models3dMapper() {
        return Mappers.getMapper(Models3dMapper.class);
    }

}
