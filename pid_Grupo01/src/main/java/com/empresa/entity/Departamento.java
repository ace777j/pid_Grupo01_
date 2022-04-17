package com.empresa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_depa")
	private int idDepa;
	@Column(name="nro_piso")
	private String nroPiso;
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_tipo")
	private TipoDepartamento tipoDepa;
	
	@JsonIgnore
	@OneToOne(mappedBy="departamento")
	private Propietario propietario;

	public int getIdDepa() {
		return idDepa;
	}

	public void setIdDepa(int idDepa) {
		this.idDepa = idDepa;
	}

	public String getNroPiso() {
		return nroPiso;
	}

	public void setNroPiso(String nroPiso) {
		this.nroPiso = nroPiso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public TipoDepartamento getTipoDepa() {
		return tipoDepa;
	}

	public void setTipoDepa(TipoDepartamento tipoDepa) {
		this.tipoDepa = tipoDepa;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
}
