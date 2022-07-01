/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Eventos;
import com.ITicket.repository.EventosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class EventosService implements IEventosService {

    @Autowired
    private EventosRepository eventosRepository;
    
    @Override
    public List<Eventos> getAllEventos() {
        return (List<Eventos>)eventosRepository.findAll();
    }

    @Override
    public Eventos getEventosById(long id) {
        return eventosRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEventos(Eventos eventos) {
        eventosRepository.save(eventos);
    }

    @Override
    public void delete(long id) {
        eventosRepository.deleteById(id);
    }
    
}
