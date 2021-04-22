package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Product;
import com.example.apppcmarcet.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", itemResourceRel = "list", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
