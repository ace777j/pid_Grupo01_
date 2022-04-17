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

import com.empresa.entity.Visitante;
import com.empresa.service.VisitanteService;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

	@Autowired
	private VisitanteService visitanteService;
	
	@GetMapping()
	public List<Visitante> listVisitantes(){
		return visitanteService.listVisitantes();
	}
	
	@GetMapping(path = "/{dni}")
	public Optional<Visitante> findVisitante(@PathVariable("dni") String dni){
		return visitanteService.findVisitante(dni);
	}
	
	@PostMapping()
	public Visitante saveVisitante(@RequestBody Visitante obj) {
		return this.visitanteService.saveVisitante(obj);
	}
}
