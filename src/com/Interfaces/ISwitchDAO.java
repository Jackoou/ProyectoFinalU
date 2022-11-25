/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Models.SwitchVO;
import java.util.List;

/**
 *
 * @author andre
 */
public interface ISwitchDAO {
    public boolean insertar_juego(SwitchVO juegoSwitch);
    public boolean actualizar_juego(SwitchVO juegoSwitch);
    public boolean eliminar_juego(String titulo);
    public List<SwitchVO> consultar_todos();
    public SwitchVO consultar_por_titulo(String titulo);
}
