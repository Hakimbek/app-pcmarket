package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Property;
import com.example.apppcmarcet.projection.PropertyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "property", itemResourceRel = "list", excerptProjection = PropertyProjection.class)
public interface PropertyRepository extends JpaRepository<Property, Integer> {
}
