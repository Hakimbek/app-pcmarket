package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Characteristic;
import com.example.apppcmarcet.projection.CharacteristicProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "characteristic", itemResourceRel = "list", excerptProjection = CharacteristicProjection.class)
public interface CharacteristicRepository extends JpaRepository<Characteristic, Integer> {
}
