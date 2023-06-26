package com.examen.demo.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.demo.domain.entity.TcPromotores;

@Repository
public interface TcPromotoresRepository extends  JpaRepository<TcPromotores, Long> {
    
}