package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Client;
import com.example.apppcmarcet.entity.Comment;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Client.class)
public interface ClientProjection {
    Integer getId();

    String getName();

    String getAddress();

    Integer getPhone();

    Double getEmail();

    List<Comment> getProduct();
}
