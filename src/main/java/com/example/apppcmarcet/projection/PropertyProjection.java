package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Characteristic;
import com.example.apppcmarcet.entity.Property;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Property.class)
public interface PropertyProjection {
    Integer getId();

    String getValue();

    Characteristic getCharacteristic();
}
