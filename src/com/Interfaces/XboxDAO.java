/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Connection.BaseConnection1;
import com.Models.XboxVO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class XboxDAO extends BaseConnection1 implements IXboxDAO{

    @Override
    public boolean insertar_juego(XboxVO juegoXbox) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("insert into Xbox (titulo,fecha,consola,genero,formato,director) values(?,?,?,?,?,?)");
            sentencia.setString(1, juegoXbox.getTitulo());
            sentencia.setString(2, juegoXbox.getFecha());
            sentencia.setString(3, juegoXbox.getConsola());
            sentencia.setString(4, juegoXbox.getGenero());
            sentencia.setString(5, juegoXbox.getFormato());
            sentencia.setString(6, juegoXbox.getDirector());
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("error " + e);
            return false;
        }
    }

    @Override
    public boolean actualizar_juego(XboxVO juegoXbox) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("update Xbox set titulo=?, fecha=?, consola=?, genero=?, formato=?, director=? where id=?");
            sentencia.setString(1, juegoXbox.getTitulo());
            sentencia.setString(2, juegoXbox.getFecha());
            sentencia.setString(3, juegoXbox.getConsola());
            sentencia.setString(4, juegoXbox.getGenero());
            sentencia.setString(5, juegoXbox.getFormato());
            sentencia.setString(6, juegoXbox.getDirector());
            sentencia.executeUpdate();
            desconectar();
            return true;
            
        } catch (Exception e) {
            System.out.println("error "+e);
            return false;
        }
    }

    @Override
    public boolean eliminar_juego(int id) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("delete from Xbox where id=?");
            sentencia.setInt(1, id);
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("error "+e);
            return false;
        }
    }

    @Override
    public List<XboxVO> consultar_todos() {
        try {
            List<XboxVO> juegosXbox = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from Xbox");
            ResultSet datos = sentencia.executeQuery();
            while(datos.next()){
                XboxVO juegoXbox = new XboxVO();
                juegoXbox.setTitulo(datos.getString("titulo"));
                juegoXbox.setFecha(datos.getString("fecha"));
                juegoXbox.setConsola(datos.getString("consola"));
                juegoXbox.setGenero(datos.getString("genero"));
                juegoXbox.setFormato(datos.getString("formato"));
                juegoXbox.setDirector(datos.getString("director"));
                juegosXbox.add(juegoXbox);
            }
            desconectar();
            return juegosXbox;
        } catch (Exception e) {
            System.out.println("error " +e);
            return null;
        }
    }

    @Override
    public XboxVO consultar_por_id(int id) {
        try {
            //List<XboxVO> juegosXbox = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from Xbox where id=?");
            sentencia.setInt(1, id);
            ResultSet datos = sentencia.executeQuery();
            if(datos.next()){
                XboxVO juegoXbox = new XboxVO();
                juegoXbox.setTitulo(datos.getString("titulo"));
                juegoXbox.setFecha(datos.getString("fecha"));
                juegoXbox.setConsola(datos.getString("consola"));
                juegoXbox.setGenero(datos.getString("genero"));
                juegoXbox.setFormato(datos.getString("formato"));
                juegoXbox.setDirector(datos.getString("director"));
                desconectar();
                return juegoXbox;              
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
