package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Supplier;
import com.example.apppcmarcet.projection.SupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", itemResourceRel = "list", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
