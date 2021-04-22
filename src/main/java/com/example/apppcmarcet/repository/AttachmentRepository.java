package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Attachment;
import com.example.apppcmarcet.projection.AttachmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
