package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Product;
import com.example.apppcmarcet.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "product", itemResourceRel = "list", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query("select * from product p join characteristic ch on ch.product_id=p.id join property p on ch_id=p.caracteristic_id where p.id=:", nativeQuery = true)
//    List<Product> findAll();
}
