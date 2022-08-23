package com.example.demo.Pacientes.Services;

import java.util.List;

import com.example.demo.Pacientes.Entities.Paciente;


public interface PacienteServices {
	
	public List<Paciente> listarPaciente();
	
    public Paciente buscarPaciente(Long id);

    public void editarPaciente(Paciente paciente, Long id);

    public void borrarPaciente(Long id);
}
