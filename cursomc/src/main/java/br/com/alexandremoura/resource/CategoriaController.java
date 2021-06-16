package br.com.alexandremoura.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandremoura.model.Categoria;
import br.com.alexandremoura.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categorias;

	@GetMapping
	public List<Categoria> listar() {
		return categorias.listar();
	}
	
	@GetMapping(value="/{id}")
	public Categoria findId(@PathVariable Long id) {
		return categorias.findId(id);
	}


}
