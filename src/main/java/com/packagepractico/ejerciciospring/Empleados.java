/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packagepractico.ejerciciospring;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleados {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="nom_Emp")
    private String nom_Emp;
    
    @Column(name="ndi_Emp")
    private String ndi_Emp;
    
    @Column(name="sex_Emp")
    private String sex_Emp;
    
    //FECHAS
    @Column(name="fec_Nac")
    private Date fec_Nac;
    @Column(name="fec_Incorporacion")
    private Date fec_Incorporacion;
    
    
    private Float sal_Emp;
    
    private Float comision_E;
    
    private String jefe_ID;
    
    private String cod_Depto;
    
    private String Cargo_E;
    
    
    //////

    public String getNom_Emp() {
        return nom_Emp;
    }

    public void setNom_Emp(String nom_Emp) {
        this.nom_Emp = nom_Emp;
    }

    public String getNdi_Emp() {
        return ndi_Emp;
    }

    public void setNdi_Emp(String ndi_Emp) {
        this.ndi_Emp = ndi_Emp;
    }

    public String getSex_Emp() {
        return sex_Emp;
    }

    public void setSex_Emp(String sex_Emp) {
        this.sex_Emp = sex_Emp;
    }

    public Date getFec_Nac() {
        return fec_Nac;
    }

    public void setFec_Nac(Date fec_Nac) {
        this.fec_Nac = fec_Nac;
    }
    
    
    
    
    public Date getFec_Incorporacion() {
        return fec_Incorporacion;
    }

    public void setFec_Incorporacion(Date fec_Incorporacion) {
        this.fec_Incorporacion = fec_Incorporacion;
    }

    public Float getSal_Emp() {
        return sal_Emp;
    }

    public void setSal_Emp(Float sal_Emp) {
        this.sal_Emp = sal_Emp;
    }

    public Float getComision_E() {
        return comision_E;
    }

    public void setComision_E(Float comision_E) {
        this.comision_E = comision_E;
    }

    public String getJefe_ID() {
        return jefe_ID;
    }

    public void setJefe_ID(String jefe_ID) {
        this.jefe_ID = jefe_ID;
    }

    public String getCod_Depto() {
        return cod_Depto;
    }

    public void setCod_Depto(String cod_Depto) {
        this.cod_Depto = cod_Depto;
    }

    public String getCargo_E() {
        return Cargo_E;
    }

    public void setCargo_E(String Cargo_E) {
        this.Cargo_E = Cargo_E;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
