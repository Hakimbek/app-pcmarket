package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Order;
import com.example.apppcmarcet.entity.Output;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(types = Output.class)
public interface OutputProjection {
    Integer getId();

    Date getDate();

    List<Order> getOrder();
}
