/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Localidades;
import com.ITicket.repository.LocalidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class LocalidadesService implements ILocalidadesService {

    @Autowired
    private LocalidadesRepository localidadesRepository;
    
    @Override
    public List<Localidades> ListLocalidades() {
       return (List<Localidades>)localidadesRepository.findAll();
    }
    
}
