package com.empresa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "visitante")
public class Visitante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_visi")
	private int idVisi;
	@Column(name="nom_visi")
	private String nomVisi;
	@Column(name="ape_visi")
	private String apeVisi;
	@Column(name="dni_visi")
	private String dniVisi;
	@Column(name="movil_visi")
	private String movilVisi;
	
	@ManyToOne
	@JoinColumn(name="id_prop")
	private Propietario propietario;

	public int getIdVisi() {
		return idVisi;
	}

	public void setIdVisi(int idVisi) {
		this.idVisi = idVisi;
	}

	public String getNomVisi() {
		return nomVisi;
	}

	public void setNomVisi(String nomVisi) {
		this.nomVisi = nomVisi;
	}

	public String getApeVisi() {
		return apeVisi;
	}

	public void setApeVisi(String apeVisi) {
		this.apeVisi = apeVisi;
	}

	public String getDniVisi() {
		return dniVisi;
	}

	public void setDniVisi(String dniVisi) {
		this.dniVisi = dniVisi;
	}

	public String getMovilVisi() {
		return movilVisi;
	}

	public void setMovilVisi(String movilVisi) {
		this.movilVisi = movilVisi;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

}
