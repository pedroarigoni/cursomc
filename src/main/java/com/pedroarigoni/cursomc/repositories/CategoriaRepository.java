package com.pedroarigoni.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedroarigoni.cursomc.domain.Categoria;

// Objeto capaz de acessar o banco de dados (Springboot e JpaRepository)

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
