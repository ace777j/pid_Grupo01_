package com.empresa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.empresa.entity.Visitante;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Integer>{

	@Query("select v from Visitante v where v.dniVisi=?1")
	Optional<Visitante> findVisitanteByDni(String dni);
	
	@Query("select v from Visitante v where v.propietario.dniProp=?1")
	List<Visitante> listVisitantesByPropietario(String dniProp);
}
