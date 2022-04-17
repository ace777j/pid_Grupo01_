package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Propietario;
import com.empresa.entity.Visitante;
import com.empresa.repository.VisitanteRepository;

@Service
public class VisitanteService {
	
	@Autowired
	private VisitanteRepository visitanteRepository;
	
	public List<Visitante> listVisitantes(){
		return visitanteRepository.findAll();
	}
	
	public List<Visitante> listVisitantesByPropietario(String dniProp){
		return visitanteRepository.listVisitantesByPropietario(dniProp);
	}
	
	public Optional<Visitante> findVisitante(String dni){
		return visitanteRepository.findVisitanteByDni(dni);
	}
	
	public Visitante saveVisitante(Visitante obj) {
		return visitanteRepository.save(obj);
	}

}
