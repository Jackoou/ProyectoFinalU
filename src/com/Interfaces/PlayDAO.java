/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Connection.BaseConnection1;
import com.Models.PlayVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class PlayDAO extends BaseConnection1 implements IPlayDAO {

    
    @Override
    public boolean insertar_juego(PlayVO juegoPlay) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("insert into Play (titulo,fecha,consola,genero,formato,director) values(?,?,?,?,?,?)");
            sentencia.setString(1, juegoPlay.getTitulo());
            sentencia.setString(2, juegoPlay.getFecha());
            sentencia.setString(3, juegoPlay.getConsola());
            sentencia.setString(4, juegoPlay.getGenero());
            sentencia.setString(5, juegoPlay.getFormato());
            sentencia.setString(6, juegoPlay.getDirector());
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("error " + e);
            return false;
        }
        
    }

    @Override
    public boolean actualizar_juego(PlayVO juegoPlay) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("update Play set titulo=?, fecha=?, consola=?, genero=?, formato=?, director=? where id=?");
            sentencia.setInt(0, juegoPlay.getId());
            sentencia.setString(1, juegoPlay.getTitulo());
            sentencia.setString(2, juegoPlay.getFecha());
            sentencia.setString(3, juegoPlay.getConsola());
            sentencia.setString(4, juegoPlay.getGenero());
            sentencia.setString(5, juegoPlay.getFormato());
            sentencia.setString(6, juegoPlay.getDirector());
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
            PreparedStatement sentencia = conexion.prepareStatement("delete from Play where id=?");
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
    public List<PlayVO> consultar_todos() {
        try {
            List<PlayVO> juegosPlay = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from Play");
            ResultSet datos = sentencia.executeQuery();
            while(datos.next()){
                PlayVO juegoPlay = new PlayVO();
                juegoPlay.setTitulo(datos.getString("titulo"));
                juegoPlay.setFecha(datos.getString("fecha"));
                juegoPlay.setConsola(datos.getString("consola"));
                juegoPlay.setGenero(datos.getString("genero"));
                juegoPlay.setFormato(datos.getString("formato"));
                juegoPlay.setDirector(datos.getString("director"));
                juegosPlay.add(juegoPlay);
            }
            desconectar();
            return juegosPlay;
        } catch (Exception e) {
            System.out.println("error " +e);
            return null;
        }
    }

    @Override
    public PlayVO consultar_por_id(int id) {
        try {

            //List<PlayVO> juegosPlay = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from Play where id=?");
            sentencia.setInt(1, id);
            ResultSet datos = sentencia.executeQuery();
            if(datos.next()){
                PlayVO juegoPlay = new PlayVO();
                juegoPlay.setId(datos.getInt("id"));
                juegoPlay.setTitulo(datos.getString("titulo"));
                juegoPlay.setFecha(datos.getString("fecha"));
                juegoPlay.setConsola(datos.getString("consola"));
                juegoPlay.setGenero(datos.getString("genero"));
                juegoPlay.setFormato(datos.getString("formato"));
                juegoPlay.setDirector(datos.getString("director"));
                desconectar();
                return juegoPlay;              
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
