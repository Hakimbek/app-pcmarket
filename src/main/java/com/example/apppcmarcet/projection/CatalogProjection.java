package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Catalog;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Catalog.class)
public interface CatalogProjection {
    Integer getId();

    String geName();

    Catalog getCatalog();
}
