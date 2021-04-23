package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Order;
import com.example.apppcmarcet.projection.OrderProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order", itemResourceRel = "list", excerptProjection = OrderProjection.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
