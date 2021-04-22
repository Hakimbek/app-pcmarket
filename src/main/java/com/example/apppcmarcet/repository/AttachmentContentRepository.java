package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.AttachmentContent;
import com.example.apppcmarcet.projection.AttachmentContentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "attachmentContent", excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
    Optional<AttachmentContent> findByAttachmentId(Integer attachment_id);
}
