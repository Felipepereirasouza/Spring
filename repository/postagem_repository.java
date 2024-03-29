package org.generation.blogpessoal.repository;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface postagem_repository extends JpaRepository<Postagem, Long> {
	public List <Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	

	
	
	

}
