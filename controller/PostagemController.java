package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.postagem_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Postagem")
@CrossOrigin("*")

public class PostagemController {

@Autowired	
private postagem_repository repositoty;

@GetMapping
public ResponseEntity<List<Postagem>> GetAll(){
	
	return ResponseEntity.ok(repositoty.findAll());

	
}


}
