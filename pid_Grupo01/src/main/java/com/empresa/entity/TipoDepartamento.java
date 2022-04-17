package com.empresa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipo_departamento")
public class TipoDepartamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo")
	private int idTipo;
	@Column(name="descrip")
	private String descrip;
	@Column(name="nro_dormitorios")
	private int nroDormitorios;
	@Column(name="nro_banos")
	private int nroBanos;
	@Column(name="area_depar")
	private String areaDepar;
	@Column(name="prec_mens")
	private double precMens;
	
	@JsonIgnore
	@OneToMany(mappedBy="tipoDepa")
	private List<Departamento> listDepartamentos;

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public int getNroDormitorios() {
		return nroDormitorios;
	}

	public void setNroDormitorios(int nroDormitorios) {
		this.nroDormitorios = nroDormitorios;
	}

	public int getNroBanos() {
		return nroBanos;
	}

	public void setNroBanos(int nroBanos) {
		this.nroBanos = nroBanos;
	}

	public String getAreaDepar() {
		return areaDepar;
	}

	public void setAreaDepar(String areaDepar) {
		this.areaDepar = areaDepar;
	}

	public double getPrecMens() {
		return precMens;
	}

	public void setPrecMens(double precMens) {
		this.precMens = precMens;
	}

	public List<Departamento> getListDepartamentos() {
		return listDepartamentos;
	}

	public void setListDepartamentos(List<Departamento> listDepartamentos) {
		this.listDepartamentos = listDepartamentos;
	}
	
}
