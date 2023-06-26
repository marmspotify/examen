package com.examen.demo.domain.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tr_solicitudes_estatus")
public class TrSolicitudesEstatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud_estatus")
    private Long idSolicitudEstatus;
    @Column(name = "id_estatus")
    private Long idEstatus;
    @Column(name = "i_solicitud")
    private Long idSolicitud;
    @Column(name = "motivo_codigo")
    private String motivoCodigo;
    @Column(name = "motivo_descripcion")
    private String motivoDescripcion;
    @Column(name = "fecha")
    private String fecha;

    public TrSolicitudesEstatus() {

    }

    public Long getIdSolicitudEstatus() {
        return idSolicitudEstatus;
    }

    public void setIdSolicitudEstatus(Long idSolicitudEstatus) {
        this.idSolicitudEstatus = idSolicitudEstatus;
    }

    public Long getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Long idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Long getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getMotivoCodigo() {
        return motivoCodigo;
    }

    public void setMotivoCodigo(String motivoCodigo) {
        this.motivoCodigo = motivoCodigo;
    }

    public String getMotivoDescripcion() {
        return motivoDescripcion;
    }

    public void setMotivoDescripcion(String motivoDescripcion) {
        this.motivoDescripcion = motivoDescripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder regresar = new StringBuilder();
        regresar.append("[");
        regresar.append(getIdSolicitudEstatus());
        regresar.append("|");
        regresar.append(getIdEstatus());
        regresar.append("|");
        regresar.append(getIdSolicitud());
        regresar.append("|");
        regresar.append(getMotivoCodigo());
        regresar.append("|");
        regresar.append(getMotivoDescripcion());
        regresar.append("|");
        regresar.append(getFecha());
        regresar.append("]");
        return regresar.toString();
    }

}
