package com.example.demo.Pacientes.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Pacientes.Dao.PacientesDao;
import com.example.demo.Pacientes.Entities.Paciente;

@Service
public class PacienteServicesImpl implements PacienteServices {

	
	@Autowired
	PacientesDao pacienteDao;
	
	@Override
	public List<Paciente> listarPaciente() {
		// TODO Auto-generated method stub
		return (List<Paciente>) pacienteDao.findAll();
	}

	@Override
	public Paciente buscarPaciente(Long id) {
		// TODO Auto-generated method stub
		return pacienteDao.findById(id).orElse(null);
	}

	@Override
	public void editarPaciente(Paciente paciente, Long id) {
		// TODO Auto-generated method stub
		 if(pacienteDao.existsById(id)){
	            paciente.setId(id);
	            pacienteDao.save(paciente);
	        }
	}

	@Override
	public void borrarPaciente(Long id) {
		// TODO Auto-generated method stub
        if(pacienteDao.existsById(id)){
            pacienteDao.deleteById(id);
        }
	}

}
