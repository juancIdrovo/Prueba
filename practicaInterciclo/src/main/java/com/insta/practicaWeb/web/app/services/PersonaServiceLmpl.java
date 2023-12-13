package com.insta.practicaWeb.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insta.practicaWeb.web.app.Dao.IPersonaDao;
import com.insta.practicaWeb.web.app.entity.Persona;



@Service
public class PersonaServiceLmpl  implements IPersoanServices{

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	@Transactional (readOnly = true)
	public Persona findById(String ci) {
		// TODO Auto-generated method stub
		return personaDao.findById(ci).orElse(null);
	}

	@Override
	@Transactional
	public void delete(String ci) {
		// TODO Auto-generated method stub
		personaDao.deleteById(ci);
	}
	
}
