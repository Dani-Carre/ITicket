/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITicket.repository;

import com.ITicket.entity.Eventos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela
 */
@Repository
public interface EventosRepository extends CrudRepository<Eventos,Long> {
    
}
