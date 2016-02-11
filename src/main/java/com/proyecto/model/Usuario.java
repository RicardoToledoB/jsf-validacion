/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.model;

import com.proyecto.util.CheckRut;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ricardotoledo
 */
@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="rut")
    @CheckRut(message="Rut incorrecto!")
    private String rut;
    @Column(name="correo")
    @Email(message="Correo Electronico no valido!")
    private String correo;
    
    @Column(name="dv")
    private String dv;
    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
       
        
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDv() {
        
        
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }
         
}
