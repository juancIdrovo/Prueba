package com.insta.practicaWeb.web.app.services;

import java.util.List;

import com.insta.practicaWeb.web.app.entity.Persona;

public interface IPersoanServices {

	public List <Persona> findAll();
	
	public Persona save (Persona persona);
	
	public Persona findById (String ci);
	
	public void delete (String ci);
	
	
}
