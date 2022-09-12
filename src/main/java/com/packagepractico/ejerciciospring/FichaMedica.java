package com.packagepractico.ejerciciospring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name = "fichamedica")
public class FichaMedica {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String nom_Emp;
    
    private String estado_Civil;
    private String fuma_Sino;
    private String diabetes_Sino;
    private String asma_Sino;
    private String cirugias_Sino;
    private String quemaduras_Sino;
    private String medicamentos_Sino;

    public String getNom_Emp() {
        return nom_Emp;
    }

    public void setNom_Emp(String nom_Emp) {
        this.nom_Emp = nom_Emp;
    }
    
    
    
    public String getEstado_Civil() {
        return estado_Civil;
    }

    public void setEstado_Civil(String estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    public String getFuma_Sino() {
        return fuma_Sino;
    }

    public void setFuma_Sino(String fuma_Sino) {
        this.fuma_Sino = fuma_Sino;
    }

    public String getDiabetes_Sino() {
        return diabetes_Sino;
    }

    public void setDiabetes_Sino(String diabetes_Sino) {
        this.diabetes_Sino = diabetes_Sino;
    }

    public String getAsma_Sino() {
        return asma_Sino;
    }

    public void setAsma_Sino(String asma_Sino) {
        this.asma_Sino = asma_Sino;
    }

    public String getCirugias_Sino() {
        return cirugias_Sino;
    }

    public void setCirugias_Sino(String cirugias_Sino) {
        this.cirugias_Sino = cirugias_Sino;
    }

    public String getQuemaduras_Sino() {
        return quemaduras_Sino;
    }

    public void setQuemaduras_Sino(String quemaduras_Sino) {
        this.quemaduras_Sino = quemaduras_Sino;
    }

    public String getMedicamentos_Sino() {
        return medicamentos_Sino;
    }

    public void setMedicamentos_Sino(String medicamentos_Sino) {
        this.medicamentos_Sino = medicamentos_Sino;
    }
      
}
