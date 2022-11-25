/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Contorllers;

import com.Interfaces.IPlayDAO;
import com.Interfaces.PlayDAO;
import com.Models.PlayVO;
import java.util.List;

/**
 *
 * @author andre
 */
public class PlayBO {
    
    private IPlayDAO Playdao;

    public PlayBO() {
        Playdao = new PlayDAO();
    }
    
    public boolean insertar_juego(PlayVO juegoPlay){
        return Playdao.insertar_juego(juegoPlay);
    }
    
    public boolean actualizar_juego(PlayVO juegoPlay){
        return Playdao.actualizar_juego(juegoPlay);
    }
    
    public boolean eliminar_juego(PlayVO juegoPlay){
        return Playdao.eliminar_juego(juegoPlay.getTitulo());
    }
    
    public List<PlayVO> consultar_todos(){
        return Playdao.consultar_todos();
    }
    
    public PlayVO consultar_por_titulo(String titulo){
        return Playdao.consultar_por_titulo(titulo);
    }
    
}
