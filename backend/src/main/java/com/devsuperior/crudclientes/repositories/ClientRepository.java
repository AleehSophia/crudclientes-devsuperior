package com.devsuperior.crudclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.crudclientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
