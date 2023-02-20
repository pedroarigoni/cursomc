package com.pedroarigoni.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedroarigoni.cursomc.domain.Produto;

// Objeto capaz de acessar o banco de dados (Springboot e JpaRepository)

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
