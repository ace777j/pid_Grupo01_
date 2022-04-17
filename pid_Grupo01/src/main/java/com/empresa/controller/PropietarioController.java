package com.empresa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Propietario;
import com.empresa.entity.Visitante;
import com.empresa.service.PropietarioService;
import com.empresa.service.VisitanteService;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private VisitanteService visitanteService;
	
	@GetMapping()
	public List<Propietario> listPropietario(){
		return propietarioService.listPropietarios();
	}
	
	@GetMapping(path = "/{dni}")
	public Optional<Propietario> findPropietario(@PathVariable("dni") String dni){
		return propietarioService.findPropietario(dni);
	}
	
	@GetMapping("/{dni}/visitantes")
	public List<Visitante> listVisitantesByPropietario(@PathVariable("dni") String dni){
		return visitanteService.listVisitantesByPropietario(dni);
	}
	
	@PostMapping()
	public Propietario savePropietario(@RequestBody Propietario obj) {
		return this.propietarioService.savePropietario(obj);
	}
}
