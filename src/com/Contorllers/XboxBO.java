/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Contorllers;

import com.Interfaces.IXboxDAO;
import com.Interfaces.XboxDAO;
import com.Models.XboxVO;
import java.util.List;

/**
 *
 * @author andre
 */
public class XboxBO {
    
    private IXboxDAO Xboxdao;

    public XboxBO() {
        Xboxdao = new XboxDAO();
    }
    
    public boolean insertar_juego(XboxVO juegoXbox){
        return Xboxdao.insertar_juego(juegoXbox);
    }
    
    public boolean actualizar_juego(XboxVO juegoXbox){
        return Xboxdao.actualizar_juego(juegoXbox);
    }
    
    public boolean eliminar_juego(XboxVO juegoXbox){
        return Xboxdao.eliminar_juego(juegoXbox.getId());
    }
    
    public List<XboxVO> consultar_todos(){
        return Xboxdao.consultar_todos();
    }
    
    public XboxVO consultar_por_id(int id){
        return Xboxdao.consultar_por_id(id);
    }
}
