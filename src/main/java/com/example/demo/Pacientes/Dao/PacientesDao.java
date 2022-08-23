package com.example.demo.Pacientes.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Pacientes.Entities.Paciente;

public interface PacientesDao extends CrudRepository<Paciente,Long>  {

}
