package br.com.alexandremoura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandremoura.model.Categoria;
import br.com.alexandremoura.repository.Categorias;

@Service
public class CategoriaService {
	
	@Autowired
	private Categorias categorias;
	
	public List<Categoria> listar(){
		return categorias.findAll();
	}

	public Categoria findId(Long id) {
		return categorias.findById(id).orElse(null);
	}
}
