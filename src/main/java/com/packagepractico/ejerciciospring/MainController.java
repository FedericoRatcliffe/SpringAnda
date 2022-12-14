/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packagepractico.ejerciciospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("")
public class MainController {
    @Autowired
    
    //private CargosEmpleadosRepository cargosempleadosRepository;
    private EmpleadosRepository empleadosRepository;
    private FichaMedicaRepository fichamedicaRepository;
    
    @GetMapping("/all")
    public @ResponseBody Iterable<FichaMedica> getAllUsers(){
        return fichamedicaRepository.findAll();
    }
    
}
