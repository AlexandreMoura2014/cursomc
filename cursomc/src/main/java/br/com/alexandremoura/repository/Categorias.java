package br.com.alexandremoura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexandremoura.model.Categoria;

public interface Categorias extends JpaRepository<Categoria, Long> {

}
