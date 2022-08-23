package com.example.demo.Poliza.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Poliza.Entities.Poliza;
import com.example.demo.Poliza.Services.PolizaServices;



@RestController
@RequestMapping("/poliza")
public class PolizaController {
	
	@Autowired
	PolizaServices polizaServices;
	
	@GetMapping
    public List<Poliza> listaProductos(){
        return polizaServices.listarPoliza();
    }
	
	@GetMapping(value= "/{id}")
    public Poliza obtenerProducto(@PathVariable Long id){
        return  polizaServices.buscarPoliza(id);
    }

    @PutMapping("/{id}")
    public void modificarProducto(@PathVariable Long id,@RequestBody Poliza poliza){
          polizaServices.editarPoliza(poliza, id);
    }

    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable Long id){
        polizaServices.borrarPoliza(id);
    }

}

