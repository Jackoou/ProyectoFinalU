/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Connection.BaseConnection1;
import com.Models.SwitchVO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class SwitchDAO extends BaseConnection1 implements ISwitchDAO{

    
    @Override
    public boolean insertar_juego(SwitchVO juegoSwitch) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("insert into Switch (titulo,fecha,consola,genero,formato,director) values(?,?,?,?,?,?)");
            sentencia.setString(1, juegoSwitch.getTitulo());
            sentencia.setString(2, juegoSwitch.getFecha());
            sentencia.setString(3, juegoSwitch.getConsola());
            sentencia.setString(4, juegoSwitch.getGenero());
            sentencia.setString(5, juegoSwitch.getFormato());
            sentencia.setString(6, juegoSwitch.getDirector());
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("error " + e);
            return false;
        }
    }

    @Override
    public boolean actualizar_juego(SwitchVO juegoSwitch) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("update Switch set fecha=?, consola=?, genero=?, formato=?, director=? where titulo=?");
            
            sentencia.setString(1, juegoSwitch.getFecha());
            sentencia.setString(2, juegoSwitch.getConsola());
            sentencia.setString(3, juegoSwitch.getGenero());
            sentencia.setString(4, juegoSwitch.getFormato());
            sentencia.setString(5, juegoSwitch.getDirector());
            sentencia.setString(6, juegoSwitch.getTitulo());
            sentencia.executeUpdate();
            desconectar();
            return true;
            
        } catch (Exception e) {
            System.out.println("error "+e);
            return false;
        }
    }

    @Override
    public boolean eliminar_juego(String titulo) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("delete from Switch where titulo=?");
            sentencia.setString(1, titulo);
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("error "+e);
            return false;
        }
    }

    @Override
    public List<SwitchVO> consultar_todos() {
        try {
            List<SwitchVO> juegosSwitch = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from Switch");
            ResultSet datos = sentencia.executeQuery();
            while(datos.next()){
                SwitchVO juegoSwitch = new SwitchVO();
                juegoSwitch.setTitulo(datos.getString("titulo"));
                juegoSwitch.setFecha(datos.getString("fecha"));
                juegoSwitch.setConsola(datos.getString("consola"));
                juegoSwitch.setGenero(datos.getString("genero"));
                juegoSwitch.setFormato(datos.getString("formato"));
                juegoSwitch.setDirector(datos.getString("director"));
                juegosSwitch.add(juegoSwitch);
            }
            desconectar();
            return juegosSwitch;
        } catch (Exception e) {
            System.out.println("error " +e);
            return null;
        }
    }

    @Override
    public SwitchVO consultar_por_titulo(String titulo) {
        try {
            List<SwitchVO> juegosSwitch = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from Switch where titulo=?");
            sentencia.setString(1, titulo);
            ResultSet datos = sentencia.executeQuery();
            if(datos.next()){
                SwitchVO juegoSwitch = new SwitchVO();
                juegoSwitch.setTitulo(datos.getString("titulo"));
                juegoSwitch.setFecha(datos.getString("fecha"));
                juegoSwitch.setConsola(datos.getString("consola"));
                juegoSwitch.setGenero(datos.getString("genero"));
                juegoSwitch.setFormato(datos.getString("formato"));
                juegoSwitch.setDirector(datos.getString("director"));
                desconectar();
                return juegoSwitch;              
            }else{
                desconectar();
                return null;
            }
        } catch (Exception e) {
            System.out.println("erro "+e);
            return null;
        }
    }
}
