package com.insta.practicaWeb.web.app.services;

import java.util.List;

import com.insta.practicaWeb.web.app.entity.Casa;

public interface ICasaServices  {
	
	public List <Casa> findAll();
	
	public Casa save(Casa tabla_casa);
	
	public Casa findById(Long casa_codigo_pk);
	
	public void delete (Long casa_codigo_pk);

}
