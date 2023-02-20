package com.pedroarigoni.cursomc.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedroarigoni.cursomc.domain.Categoria;
import com.pedroarigoni.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias") // URL do navegador
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) { // PathVariable do Spring informa que o id oriundo da URL deve para a variável id 
		Optional<Categoria> obj = service.buscar(id);		
		return ResponseEntity.ok().body(obj);
	}
}
