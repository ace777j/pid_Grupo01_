package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Departamento;
import com.empresa.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping()
	public List<Departamento> listDepartamentos(@RequestParam(required = false) String tipo){
		return departamentoService.listDepartamentos(tipo);
	}
	
	@PostMapping
	public Departamento saveDepartamento(@RequestBody Departamento obj) {
		return departamentoService.saveDepartamento(obj);
	}

}
