package com.example.demo.Poliza.Services;

import java.util.List;


import com.example.demo.Poliza.Entities.Poliza;


public interface PolizaServices {
	
	public List<Poliza> listarPoliza();
	
    public Poliza buscarPoliza(Long id);

    public void editarPoliza(Poliza poliza, Long id);

    public void borrarPoliza(Long id);

}