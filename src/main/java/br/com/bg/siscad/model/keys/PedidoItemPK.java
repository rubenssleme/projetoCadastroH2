package br.com.bg.siscad.model.keys;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import br.com.bg.siscad.model.entities.Pedido;
import br.com.bg.siscad.model.entities.Produto;
import lombok.Data;

@Data
@Embeddable
public class PedidoItemPK implements Serializable {

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
}
