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
    private String Titulo;
    private String Fecha;
    private String Genero;
    private String Consola;
    private String Formato;
    private String Director;

    public XboxVO() {
    }

    public XboxVO(String Titulo, String Fecha, String Genero, String Consola, String Formato, String Director) {
        this.Titulo = Titulo;
        this.Fecha = Fecha;
        this.Genero = Genero;
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
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
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
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
}
