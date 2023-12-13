package com.insta.practicaWeb.web.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tabla_casa")
public class Casa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long casa_codigo_pk;

	private String nombre_casa;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createat;
	
	@PrePersist
	public void prePersist() {
		createat = new Date();
	}

	////////////////////////////////////////////////////////////
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn (name = "id_casa_fk")
	private List <Persona> listaPersona;
	
	//Unir Persona a casa   Casa>Persona
	////////////////////////////////////////////////////////////

	public Long getCasa_codigo_pk() {
		return casa_codigo_pk;
	}

	public void setCasa_codigo_pk(Long casa_codigo_pk) {
		this.casa_codigo_pk = casa_codigo_pk;
	}

	public String getNombre_casa() {
		return nombre_casa;
	}

	public void setNombre_casa(String nombre_casa) {
		this.nombre_casa = nombre_casa;
	}

	public Date getCreateat() {
		return createat;
	}

	public void setCreateat(Date createat) {
		this.createat = createat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
