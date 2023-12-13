package com.insta.practicaWeb.web.app.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table (name = "tabla_persona", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_casa_fk", "edad"})})
public class  Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id		
	@Column (length = 10)
	private String ci;
	
	
	private Long edad;
	private String nombre;
	private String apellido;	
	private Long id_casa_fk;
	
	
	
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public Long getEdad() {
		return edad;
	}
	public void setEdad(Long edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getId_casa_fk() {
		return id_casa_fk;
	}
	public void setId_casa_fk(Long id_casa_fk) {
		this.id_casa_fk = id_casa_fk;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	/////////////////////////////////////
	
	
	
	/////////////////////////////////////
	
	
	
}
