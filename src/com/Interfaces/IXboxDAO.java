/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Models.XboxVO;
import java.util.List;

/**
 *
 * @author andre
 */
public interface IXboxDAO {
    public boolean insertar_juego(XboxVO juegoXbox);
    public boolean actualizar_juego(XboxVO juegoXbox);
    public boolean eliminar_juego(String titulo);
    public List<XboxVO> consultar_todos(); 
    public XboxVO consultar_por_titulo(String titulo);
}
