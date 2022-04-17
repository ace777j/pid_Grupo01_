package com.empresa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "propietario")
public class Propietario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_prop")
	private int idProp;
	@Column(name="nom_prop")
	private String nomProp;
	@Column(name="ape_prop")
	private String apeProp;
	@Column(name="dni_prop")
	private String dniProp;
	@Column(name="correo_prop")
	private String correoProp;
	@Column(name="movil_prop")
	private String movilProp;
	@Column(name="nro_mascotas")
	private int nroMascotas;
	
	@JsonIgnore
	@OneToMany(mappedBy="propietario")
	private List<Visitante> listVisitantes;
	
	@OneToOne
	@JoinColumn(name="id_depa")
	private Departamento departamento;

	public int getIdProp() {
		return idProp;
	}

	public void setIdProp(int idProp) {
		this.idProp = idProp;
	}

	public String getNomProp() {
		return nomProp;
	}

	public void setNomProp(String nomProp) {
		this.nomProp = nomProp;
	}

	public String getApeProp() {
		return apeProp;
	}

	public void setApeProp(String apeProp) {
		this.apeProp = apeProp;
	}

	public String getDniProp() {
		return dniProp;
	}

	public void setDniProp(String dniProp) {
		this.dniProp = dniProp;
	}

	public String getCorreoProp() {
		return correoProp;
	}

	public void setCorreoProp(String correoProp) {
		this.correoProp = correoProp;
	}

	public String getMovilProp() {
		return movilProp;
	}

	public void setMovilProp(String movilProp) {
		this.movilProp = movilProp;
	}

	public int getNroMascotas() {
		return nroMascotas;
	}

	public void setNroMascotas(int nroMascotas) {
		this.nroMascotas = nroMascotas;
	}

	public List<Visitante> getListVisitantes() {
		return listVisitantes;
	}

	public void setListVisitantes(List<Visitante> listVisitantes) {
		this.listVisitantes = listVisitantes;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
