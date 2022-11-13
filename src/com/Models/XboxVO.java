/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models;

import java.util.Date;

/**
 *
 * @author andre
 */
public class XboxVO {
    private int id;
    private String Titulo;
    private Date Fecha;
    private String Consola;
    private String Formato;
    private String Director;

    public XboxVO() {
    }

    public XboxVO(String Titulo, Date Fecha, String Consola, String Formato, String Director) {
        this.Titulo = Titulo;
        this.Fecha = Fecha;
        this.Consola = Consola;
        this.Formato = Formato;
        this.Director = Director;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Consola
     */
    public String getConsola() {
        return Consola;
    }

    /**
     * @param Consola the Consola to set
     */
    public void setConsola(String Consola) {
        this.Consola = Consola;
    }

    /**
     * @return the Formato
     */
    public String getFormato() {
        return Formato;
    }

    /**
     * @param Formato the Formato to set
     */
    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    /**
     * @return the Director
     */
    public String getDirector() {
        return Director;
    }

    /**
     * @param Director the Director to set
     */
    public void setDirector(String Director) {
        this.Director = Director;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
}
