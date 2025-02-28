package br.com.bg.siscad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bg.siscad.model.entities.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

}
