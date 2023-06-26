package com.examen.demo.domain.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tc_clientes")
public class TcClientes implements  Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name= "id_cliente")
   private Long idCliente;   
   @Column(name="id_promotor")
   private Long idPromotor; 
   @Column(name="nombre")
   private String nombre;
   @Column(name = "apellido_paterno")
   private String apellidoPaterno;   
   @Column (name="apellido_materno")
   private String apellidoMaterno;


   public  TcClientes (){     

   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getNombre() {
       return nombre;
   }

   public void setApellidoMaterno(String apellidoMaterno) {
       this.apellidoMaterno = apellidoMaterno;
   }

   public String getApellidoMaterno() {
       return apellidoMaterno;
   }
 
   public void setApellidoPaterno(String apellidoPaterno) {
       this.apellidoPaterno = apellidoPaterno;
   }
   
   public void setIdCliente(Long idCliente) {
       this.idCliente = idCliente;
   }
   public Long getIdCliente() {
       return idCliente;
   }

   public Long getIdDimexPromotor() {
       return idPromotor;
   }

   public String getApellidoPaterno() {
       return apellidoPaterno;
   }

   public void setIdPromotor(Long idPromotor) {
       this.idPromotor = idPromotor;
   }
   

  @Override
  public String toString() { 
    StringBuilder regresar= new StringBuilder();
    regresar.append("[");
    regresar.append(getIdCliente());
    regresar.append("|");
    regresar.append(getApellidoMaterno());
    regresar.append("|");
	regresar.append(getApellidoMaterno());	     
    regresar.append("]");
  	return regresar.toString();
  }




}   
