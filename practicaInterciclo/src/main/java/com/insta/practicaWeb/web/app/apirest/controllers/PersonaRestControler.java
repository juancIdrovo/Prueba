package com.insta.practicaWeb.web.app.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.insta.practicaWeb.web.app.entity.Persona;
import com.insta.practicaWeb.web.app.services.IPersoanServices;

@RestController
@RequestMapping ("/api")
public class PersonaRestControler {
	
	@Autowired
	private IPersoanServices personaService;
	
	@GetMapping ("/tabla_persona") //Listar\\
	public List <Persona> index(){
		
		return personaService.findAll();
		
	}
	
	//buscar\\
	@GetMapping("/tabla_persona/{ci}")
	public Persona show(@PathVariable String ci) {
		return personaService.findById(ci);
	}
	
	//guardar\\
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	//modificar\\
	
	public Persona update(@RequestBody Persona persona, @PathVariable String ci) {
		Persona personaActual = personaService.findById(ci);
		
		personaActual.setApellido(persona.getApellido());
		personaActual.setEdad(persona.getEdad());
		personaActual.setNombre(persona.getNombre());
		
		return personaService.save(personaActual);
	}
	
	//eliminar\\
	
	@DeleteMapping("/tabla_persona/{ci}")
	public void delete(@PathVariable String ci) {
		personaService.delete(ci);
	}
	
	
}
