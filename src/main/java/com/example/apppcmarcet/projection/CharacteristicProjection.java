package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Characteristic;
import com.example.apppcmarcet.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Characteristic.class)
public interface CharacteristicProjection {
    Integer getId();

    String getName();

    List<Product> getProduct();
}
