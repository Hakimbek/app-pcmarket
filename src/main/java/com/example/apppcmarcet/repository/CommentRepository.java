package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Comment;
import com.example.apppcmarcet.projection.CommentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comment", excerptProjection = CommentProjection.class)
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
