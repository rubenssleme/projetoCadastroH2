package br.com.bg.siscad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bg.siscad.model.entities.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

}
