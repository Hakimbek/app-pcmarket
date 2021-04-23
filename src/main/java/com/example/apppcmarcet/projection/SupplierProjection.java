package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface SupplierProjection {
    Integer getId();

    String getName();

    String getEmail();

    String getMessage();
}
