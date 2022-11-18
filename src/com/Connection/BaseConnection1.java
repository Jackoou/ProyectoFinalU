/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author andre
 */
public class BaseConnection1 {
    
    public Connection conexion;

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver cargando...");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progamming?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8","root","Inkisidor123");
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    protected void desconectar() {
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }
}
