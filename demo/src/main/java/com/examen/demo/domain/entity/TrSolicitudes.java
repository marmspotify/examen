package com.examen.demo.domain.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tr_solicitudes")
public class TrSolicitudes implements  Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name= "id_solicitud")
   private Long idSolicitud;      
   @Column(name="idPromotor")
   private Long idCliente;
   @Column(name="idCliente")
   private Long idPromotor;
   @Column(name="idTipoSolicitud")
   private Long idTipoSolicitud;
   @Column(name="idSolicitudEstatus")
   private Long idSolicitudEstatus;
   @Column(name = "monto")
   private String monto;      
   @Column(name = "producto")
   private String producto;  
   @Column(name = "tipoSolicitudStr")
   private String tipoSolicitudStr;  
   @Column(name = "tasa")
   private String tasa;  
   @Column(name = "plazo")
   private String plazo;  
   @Column(name = "frecuencia")
   private String frecuencia;  
   @Column(name = "fechaSolicitud")
   private String fechaSolicitud;  

   public  TrSolicitudes (){     

   }

   public Long getIdSolicitud() {
      return idSolicitud;
   }

   public void setIdSolicitud(Long idSolicitud) {
      this.idSolicitud = idSolicitud;
   }

   public Long getIdCliente() {
      return idCliente;
   }

   public void setIdCliente(Long idCliente) {
      this.idCliente = idCliente;
   }

   public Long getIdPromotor() {
      return idPromotor;
   }

   public void setIdPromotor(Long idPromotor) {
      this.idPromotor = idPromotor;
   }

   public Long getIdTipoSolicitud() {
      return idTipoSolicitud;
   }

   public void setIdTipoSolicitud(Long idTipoSolicitud) {
      this.idTipoSolicitud = idTipoSolicitud;
   }

   public Long getIdSolicitudEstatus() {
      return idSolicitudEstatus;
   }

   public void setIdSolicitudEstatus(Long idSolicitudEstatus) {
      this.idSolicitudEstatus = idSolicitudEstatus;
   }

   public String getMonto() {
      return monto;
   }

   public void setMonto(String monto) {
      this.monto = monto;
   }

   public String getProducto() {
      return producto;
   }

   public void setProducto(String producto) {
      this.producto = producto;
   }

   public String getTipoSolicitudStr() {
      return tipoSolicitudStr;
   }

   public void setTipoSolicitudStr(String tipoSolicitudStr) {
      this.tipoSolicitudStr = tipoSolicitudStr;
   }

   public String getTasa() {
      return tasa;
   }

   public void setTasa(String tasa) {
      this.tasa = tasa;
   }

   public String getPlazo() {
      return plazo;
   }

   public void setPlazo(String plazo) {
      this.plazo = plazo;
   }

   public String getFrecuencia() {
      return frecuencia;
   }

   public void setFrecuencia(String frecuencia) {
      this.frecuencia = frecuencia;
   }

   public String getFechaSolicitud() {
      return fechaSolicitud;
   }

   public void setFechaSolicitud(String fechaSolicitud) {
      this.fechaSolicitud = fechaSolicitud;
   }

   @Override
   public String toString() { 
      StringBuilder regresar= new StringBuilder();
      regresar.append("[");
      regresar.append(getIdSolicitud());
      regresar.append("|");
      regresar.append(getIdCliente());
      regresar.append("|");
      regresar.append(getIdPromotor());	     
      regresar.append("|");
      regresar.append(getIdTipoSolicitud());	     
      regresar.append("|");
      regresar.append(getIdSolicitudEstatus());	     
      regresar.append("|");
      regresar.append(getMonto());	     
      regresar.append("|");
      regresar.append(getProducto());	     
      regresar.append("|");
      regresar.append(getTipoSolicitudStr());	     
      regresar.append("|");
      regresar.append(getTasa());	     
      regresar.append("|");
      regresar.append(getPlazo());	     
      regresar.append("|");
      regresar.append(getFrecuencia());	     
      regresar.append("|");
      regresar.append(getFechaSolicitud());	     
      regresar.append("]");
      return regresar.toString();
   }
}
