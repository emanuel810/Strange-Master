package com.example.demo.Citas.Services;

import java.util.List;

import com.example.demo.Citas.Entities.Citas;


public interface CitasServices {
	
	public List<Citas> listarCitas();
	
    public Citas buscarCitas(Long id);

    public void editarCitas(Citas citas, Long id);

    public void borrarCitas(Long id);

}