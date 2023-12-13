package com.insta.practicaWeb.web.app.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.insta.practicaWeb.web.app.entity.Casa;
import com.insta.practicaWeb.web.app.services.ICasaServices;


@RestController
@RequestMapping ("/api")
public class CasaRestController {

	@Autowired
	private ICasaServices casaService;
	
	@GetMapping("tabla_casa")
	public List <Casa> index(){
		return casaService.findAll();
		
	}
	
	@GetMapping ("tabla_casa/{casa_codigo_pk}")
	public Casa show(@PathVariable Long casa_codigo_pk) {
		return casaService.findById(casa_codigo_pk);
	}
	
	@PostMapping("/tabla_casa/")
	@ResponseStatus (HttpStatus.CREATED)
	public Casa create(@RequestBody Casa casa) {
		return casaService.save(casa);
	}
	
	@PutMapping ("/tabla_casa/{casa_codigo_pk}")
	@ResponseStatus (HttpStatus.CREATED)
	public Casa update(@RequestBody Casa casa, @PathVariable Long casa_codigo_pk) {
		Casa casaActual = casaService.findById(casa_codigo_pk);
		
		casaActual.setNombre_casa(casa.getNombre_casa());
		
		return casaService.save(casaActual);
	}
	
	@DeleteMapping ("/tabla_casa/{casa_codigo_pk}")
	@ResponseStatus (HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long casa_codigo_pk) {
		casaService.delete(casa_codigo_pk);
	}
	

}
