package com.example.apppcmarcet.repository;

import com.example.apppcmarcet.entity.Client;
import com.example.apppcmarcet.projection.ClientProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", itemResourceRel = "list", excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
