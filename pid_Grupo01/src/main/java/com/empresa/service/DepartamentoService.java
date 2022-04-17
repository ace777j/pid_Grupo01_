package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Departamento;
import com.empresa.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	public List<Departamento> listDepartamentos(String tipo){
		if(tipo==null) {
			return (List<Departamento>) departamentoRepository.findAll();
		}else {
			List<Departamento> listOfDepas = (List<Departamento>) departamentoRepository.listDepartamentosByTipo(tipo);
			return listOfDepas;
		}
	}
	
	public Departamento saveDepartamento(Departamento obj) {
		return departamentoRepository.save(obj);
	}
}
