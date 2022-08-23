package com.example.demo.Citas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Citas.Entities.Citas;
import com.example.demo.Citas.Services.CitasServices;



@RestController
@RequestMapping("/citas")
public class CitasController {
	
	@Autowired
	CitasServices citasServices;
	
	@GetMapping
    public List<Citas> listaProductos(){
        return citasServices.listarCitas();
    }
	
	@GetMapping(value= "/{id}")
    public Citas obtenerProducto(@PathVariable Long id){
        return  citasServices.buscarCitas(id);
    }

    @PutMapping("/{id}")
    public void modificarProducto(@PathVariable Long id,@RequestBody Citas citas){
          citasServices.editarCitas(citas, id);
    }

    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable Long id){
        citasServices.borrarCitas(id);
    }

}

