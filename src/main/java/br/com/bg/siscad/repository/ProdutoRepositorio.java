package br.com.bg.siscad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bg.siscad.model.entities.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
