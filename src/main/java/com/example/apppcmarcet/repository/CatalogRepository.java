package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Catalog;
import com.example.apppcmarcet.projection.CatalogProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "catalog", excerptProjection = CatalogProjection.class)
public interface CatalogRepository extends JpaRepository<Catalog, Integer> {
}
