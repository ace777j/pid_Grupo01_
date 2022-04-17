package com.empresa.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.empresa.entity.Propietario;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Integer>{

	@Query("select p from Propietario p where p.dniProp=?1")
	Optional<Propietario> findPropietarioByDni(String dni);
}
