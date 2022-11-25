/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Models.PlayVO;
import java.util.List;

/**
 *
 * @author andre
 */
public interface IPlayDAO {
    public boolean insertar_juego(PlayVO juegoPlay);
    public boolean actualizar_juego(PlayVO juegoPlay);
    public boolean eliminar_juego(String titulo);
    public List<PlayVO> consultar_todos();
    public PlayVO consultar_por_titulo(String titulo);
}
