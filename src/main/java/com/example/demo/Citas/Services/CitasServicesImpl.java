
package com.example.demo.Citas.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Citas.Dao.CitasDao;
import com.example.demo.Citas.Entities.Citas;


@Service
public class CitasServicesImpl implements CitasServices {

	
	
	@Autowired
	CitasDao polizaDao;
	
	
	@Override
	public List<Citas> listarCitas() {
		// TODO Auto-generated method stub
		return (List<Citas>) polizaDao.findAll();
	}

	@Override
	public Citas buscarCitas(Long id) {
		// TODO Auto-generated method stub
		return polizaDao.findById(id).orElse(null);
	}

	@Override
	public void editarCitas(Citas citas, Long id) {
		// TODO Auto-generated method stub
		 if(polizaDao.existsById(id)){
			 	citas.setId(id);
	            polizaDao.save(citas);
	        }
	}

	@Override
	public void borrarCitas(Long id) {
		// TODO Auto-generated method stub
		if(polizaDao.existsById(id)){
			polizaDao.deleteById(id);
        }
	}

}
