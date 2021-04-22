package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Comment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Comment.class)
public interface CommentProjection {
    Integer getId();

    String getUserName();

    String getUserEmail();

    String getText();
}
