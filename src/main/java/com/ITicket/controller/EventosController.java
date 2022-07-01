/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.controller;

import com.ITicket.entity.Eventos;
import com.ITicket.entity.Localidades;
import com.ITicket.service.IEventosService;
import com.ITicket.service.ILocalidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Daniela
 */
@Controller
public class EventosController {
    @Autowired
    private IEventosService eventosService;
    
    @Autowired
    private ILocalidadesService localidadesService;
    
    @GetMapping("/eventos")
    public String index (Model model){
        List<Eventos> listaEventos = eventosService.getAllEventos();
        model.addAttribute("titulo","Historial de Eventos");
        model.addAttribute("eventos",listaEventos);
        return "eventos";
    }
    
    @GetMapping("/eventosN")
    public String crearEventos (Model model){
        List<Localidades> listaLocalidades = localidadesService.ListLocalidades();
        model.addAttribute("eventos",new Eventos());
        model.addAttribute("localidades",listaLocalidades);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarEventos (@ModelAttribute Eventos eventos){
        eventosService.saveEventos(eventos);
        return "redirect:/eventos";
    }
    
    @GetMapping("/editEventos/{id}")
    public String editarEventos (@PathVariable("id") Long idEventos, Model model){
        Eventos eventos = eventosService.getEventosById(idEventos);
        List<Localidades> listaLocalidades = localidadesService.ListLocalidades();
        model.addAttribute("eventos",eventos);
        model.addAttribute("localidades",listaLocalidades);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarEventos (@PathVariable("id") Long idEventos){
        eventosService.delete(idEventos);
        return "redirect:/eventos";
    }
}
