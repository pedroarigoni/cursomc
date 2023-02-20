package com.pedroarigoni.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedroarigoni.cursomc.domain.Categoria;
import com.pedroarigoni.cursomc.repositories.CategoriaRepository;

@Service // Notação do Spring
public class CategoriaService {

	@Autowired // Autoinstancia o objeto
	private CategoriaRepository repo;
	
	public Optional<Categoria> buscar(Integer id){
		Optional<Categoria> obj = repo.findById(id);
		return obj;
	}
	
}
