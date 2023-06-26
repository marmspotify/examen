package com.examen.demo.domain.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tc_promotores")
public class TcPromotores implements  Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name= "id_promotor")
   private Long idPromotor;      
   @Column(name="clave")
   private String clave;
   @Column(name = "empresa")
   private String empresa;      

   public  TcPromotores (){     

   }

   public void setIdPromotor(Long idPromotor) {
       this.idPromotor = idPromotor;
   }

   public Long getIdPromotor() {
       return idPromotor;
   }

   public void setClave(String clave) {
       this.clave = clave;
   }

   public String getClave() {
       return clave;
   }

   public void setEmpresa(String empresa) {
       this.empresa = empresa;
   }

   public String getEmpresa() {
       return empresa;
   }
   

  @Override
  public String toString() { 
    StringBuilder regresar= new StringBuilder();
    regresar.append("[");
    regresar.append(getIdPromotor());
    regresar.append("|");
    regresar.append(getClave());
    regresar.append("|");
	regresar.append(getEmpresa());	     
    regresar.append("]");
  	return regresar.toString();
  }




}   
