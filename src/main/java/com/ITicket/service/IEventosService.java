/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Eventos;
import java.util.List;

/**
 *
 * @author Daniela
 */
public interface IEventosService {
    public List<Eventos> getAllEventos();
    public Eventos getEventosById (long id);
    public void saveEventos(Eventos eventos);
    public void delete (long id);
}
