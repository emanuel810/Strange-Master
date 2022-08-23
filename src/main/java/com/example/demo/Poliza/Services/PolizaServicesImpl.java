
package com.example.demo.Poliza.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Poliza.Dao.PolizaDao;
import com.example.demo.Poliza.Entities.Poliza;


@Service
public class PolizaServicesImpl implements PolizaServices {

	
	
	@Autowired
	PolizaDao polizaDao;
	
	
	@Override
	public List<Poliza> listarPoliza() {
		// TODO Auto-generated method stub
		return (List<Poliza>) polizaDao.findAll();
	}

	@Override
	public Poliza buscarPoliza(Long id) {
		// TODO Auto-generated method stub
		return polizaDao.findById(id).orElse(null);
	}

	@Override
	public void editarPoliza(Poliza poliza, Long id) {
		// TODO Auto-generated method stub
		 if(polizaDao.existsById(id)){
			 	poliza.setId(id);
	            polizaDao.save(poliza);
	        }
	}

	@Override
	public void borrarPoliza(Long id) {
		// TODO Auto-generated method stub
		if(polizaDao.existsById(id)){
			polizaDao.deleteById(id);
        }
	}

}
