package com.examen.demo.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.demo.application.repository.TcPromotoresRepository;
import com.examen.demo.domain.entity.TcPromotores;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TcPromotoresService {

    @Autowired
    TcPromotoresRepository tcPromotoresRepository;

    public TcPromotores saveTcPromotores(TcPromotores tcPromotores) {

        return tcPromotoresRepository.save(tcPromotores);

    }

}
