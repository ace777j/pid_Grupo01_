package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.empresa.entity.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{

	@Query("select d from Departamento d where d.tipoDepa.descrip=?1")
	List<Departamento> listDepartamentosByTipo(String descrip);
}
