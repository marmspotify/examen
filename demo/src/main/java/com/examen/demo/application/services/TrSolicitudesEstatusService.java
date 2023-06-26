package com.examen.demo.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.demo.application.repository.TrSolicitudesEstatusRepository;
import com.examen.demo.domain.entity.TrSolicitudesEstatus;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TrSolicitudesEstatusService {

    @Autowired
    TrSolicitudesEstatusRepository trSolicitudesEstatusRepository;

    public TrSolicitudesEstatus saveTrSolicitudesEstatus(TrSolicitudesEstatus trSolicitudesEstatus) {

        return trSolicitudesEstatusRepository.save(trSolicitudesEstatus);

    }

}
