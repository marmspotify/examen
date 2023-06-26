package com.examen.demo.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.demo.application.repository.TcClientesRepository;
import com.examen.demo.domain.entity.TcClientes;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TcClientesService {

    @Autowired
    TcClientesRepository tcClientesRepository;

    public TcClientes saveTcClientes(TcClientes tcClientes) {

        return tcClientesRepository.save(tcClientes);

    }

}
