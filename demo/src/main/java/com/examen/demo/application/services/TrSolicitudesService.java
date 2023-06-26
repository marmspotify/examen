package com.examen.demo.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.demo.application.repository.TrSolicitudesRepository;
import com.examen.demo.domain.entity.TrSolicitudes;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TrSolicitudesService {

    @Autowired
    TrSolicitudesRepository trSolicitudesRepository;

    public TrSolicitudes saveTrSolicitudes(TrSolicitudes trSolicitudes) {

        return trSolicitudesRepository.save(trSolicitudes);

    }

}
