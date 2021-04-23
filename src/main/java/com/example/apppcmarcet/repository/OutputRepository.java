package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Output;
import com.example.apppcmarcet.projection.OutputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", itemResourceRel = "list", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
