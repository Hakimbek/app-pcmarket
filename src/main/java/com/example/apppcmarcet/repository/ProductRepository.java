package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Product;
import com.example.apppcmarcet.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "product", itemResourceRel = "list", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product p\n" +
            "    join characteristic c on p.id = c.product_id\n" +
            "    join property pro on c.id = pro.characteristic_id\n" +
            "where pro.id in (:id)", nativeQuery = true)
    List<Product> findAll(Integer[] id);
}
