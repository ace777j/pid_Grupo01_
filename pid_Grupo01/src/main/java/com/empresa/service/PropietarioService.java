package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Propietario;
import com.empresa.repository.PropietarioRepository;

@Service
public class PropietarioService {

	@Autowired
	private PropietarioRepository propietarioRepository ;
	
	public List<Propietario> listPropietarios(){
		return propietarioRepository.findAll();
	}
	
	public Optional<Propietario> findPropietario(String dni){
		return propietarioRepository.findPropietarioByDni(dni);
	}
	
	public Propietario savePropietario(Propietario obj) {
		return propietarioRepository.save(obj);
	}
}
