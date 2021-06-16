package br.com.alexandremoura.resource;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.alexandremoura.model.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@GetMapping
	public List<Categoria> listar() {
		Categoria categoria1 = new Categoria(1L, "Informática");
		Categoria categoria2 = new Categoria(2L, "Escritório");
		Categoria categoria3 = new Categoria(3L, "Software");
		
		List<Categoria> lista = new ArrayList<>(Arrays.asList(categoria1, categoria2, categoria3));
		
		return lista;
	}

}
