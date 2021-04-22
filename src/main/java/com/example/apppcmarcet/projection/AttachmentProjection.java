package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    Integer getId();

    String geName();

    String getSize();

    String getContentType();
}
