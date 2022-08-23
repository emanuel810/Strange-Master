package com.example.demo.Pacientes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pacientes.Entities.Paciente;
import com.example.demo.Pacientes.Services.PacienteServices;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	

	@Autowired
	PacienteServices pacienteServices;
	
	@GetMapping
    public List<Paciente> listaProductos(){
        return pacienteServices.listarPaciente();
    }
	
	@GetMapping(value= "/{id}")
    public Paciente obtenerProducto(@PathVariable Long id){
        return  pacienteServices.buscarPaciente(id);
    }

    @PutMapping("/{id}")
    public void modificarProducto(@PathVariable Long id,@RequestBody Paciente paciente){
          pacienteServices.editarPaciente(paciente, id);
    }

    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable Long id){
        pacienteServices.borrarPaciente(id) ;
    }

}
