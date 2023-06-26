package com.examen.demo.infrastructure.dto;

import java.io.Serializable;

import com.examen.demo.domain.entity.TcClientes;
import com.examen.demo.domain.entity.TrSolicitudes;

public class AltaSolicitud implements Serializable {

    public String promotor;
    public String empresa;
    public TcClientes cliente;
    public TrSolicitudes solicitud;

    public AltaSolicitud() {
        this.cliente = new Cliente();
        this.solicitud = new Solicitud();
    }

    public String getPromotor() {
        return promotor;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public TcClientes getCliente() {
        return cliente;
    }

    public void setCliente(TcClientes cliente) {
        this.cliente = cliente;
    }

    public TrSolicitudes getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(TrSolicitudes solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public String toString() {        
        return super.toString();
    }

}
