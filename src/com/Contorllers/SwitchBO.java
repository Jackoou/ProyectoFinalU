/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Contorllers;

import com.Interfaces.ISwitchDAO;
import com.Interfaces.SwitchDAO;
import com.Models.SwitchVO;
import java.util.List;

/**
 *
 * @author andre
 */
public class SwitchBO {
    
    private ISwitchDAO Switchdao;

    public SwitchBO() {
        Switchdao = new SwitchDAO();
    }
    
    public boolean insertar_juego(SwitchVO juegoSwitch){
        return Switchdao.insertar_juego(juegoSwitch);
    }
    
    public boolean actualizar_juego(SwitchVO juegoSwitch){
        return Switchdao.actualizar_juego(juegoSwitch);
    }
    
    public boolean eliminar_juego(SwitchVO juegoSwitch){
        return Switchdao.eliminar_juego(juegoSwitch.getId());
    }
    
    public List<SwitchVO> consultar_todos(){
        return Switchdao.consultar_todos();
    }
    
    public SwitchVO consultar_por_id(int id){
        return Switchdao.consultar_por_id(id);
    }
    
}
