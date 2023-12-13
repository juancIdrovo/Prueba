package com.insta.practicaWeb.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insta.practicaWeb.web.app.Dao.ICasaDao;
import com.insta.practicaWeb.web.app.entity.Casa;

@Service
public class CasaServiceLmpl implements ICasaServices {
	
	@Autowired
	private ICasaDao casaDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Casa> findAll() {
		// TODO Auto-generated method stub
		return (List<Casa>) casaDao.findAll();
	}

	@Override
	@Transactional
	public Casa save(Casa tabla_casa) {
		// TODO Auto-generated method stub
		return casaDao.save(tabla_casa);
	}

	@Override
	@Transactional (readOnly = true)
	public Casa findById(Long casa_codigo_pk) {
		// TODO Auto-generated method stub
		return casaDao.findById(casa_codigo_pk).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long casa_codigo_pk) {
		// TODO Auto-generated method stub
		casaDao.deleteById(casa_codigo_pk);
	}

	

}
