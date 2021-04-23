package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Client;
import com.example.apppcmarcet.entity.Order;
import com.example.apppcmarcet.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Order.class)
public interface OrderProjection {
    Integer getId();

    Client getClient();

    List<Product> getProduct();

    Integer getAmount();
}
