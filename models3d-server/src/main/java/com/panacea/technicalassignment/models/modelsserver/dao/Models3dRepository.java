package com.panacea.technicalassignment.models.modelsserver.dao;

import com.panacea.technicalassignment.models.modelsserver.model.Models3d;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Models3dRepository extends JpaRepository<Models3d, Long>  {

    Models3d findId(Long id);
}
