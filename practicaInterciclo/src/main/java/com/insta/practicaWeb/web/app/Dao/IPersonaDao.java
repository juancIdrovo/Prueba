package com.insta.practicaWeb.web.app.Dao;

import org.springframework.data.repository.CrudRepository;

import com.insta.practicaWeb.web.app.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, String>{

}
