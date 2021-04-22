package com.example.apppcmarcet.projection;

import com.example.apppcmarcet.entity.Attachment;
import com.example.apppcmarcet.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentProjection {
    Integer getId();

    byte[] getBytes();

    Attachment getAttachment();
}
