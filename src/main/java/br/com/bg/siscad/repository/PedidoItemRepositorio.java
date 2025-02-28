package br.com.bg.siscad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bg.siscad.model.entities.PedidoItem;

public interface PedidoItemRepositorio extends JpaRepository<PedidoItem, Long> {

}
