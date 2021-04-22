package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Catalog;
import com.example.apppcmarcet.entity.Comment;
import com.example.apppcmarcet.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Product.class)
public interface ProductProjection {
    Integer getId();

    String getModel();

    String getBrand();

    Integer getGuarantee();

    Double getPrice();

    Catalog getCatalog();

    List<Comment> getComment();
}
