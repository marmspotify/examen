package com.examen.demo.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.demo.domain.entity.TcClientes;

@Repository
public interface TcClientesRepository extends  JpaRepository<TcClientes, Long> {
    
}
