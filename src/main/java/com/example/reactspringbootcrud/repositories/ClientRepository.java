package com.example.reactspringbootcrud.repositories;

import com.example.reactspringbootcrud.datamodels.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
