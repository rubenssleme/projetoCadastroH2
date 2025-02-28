package br.com.bg.siscad.model.entities;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import br.com.bg.siscad.model.keys.PedidoItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_pedido_item")
public class PedidoItem implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private PedidoItemPK id = new PedidoItemPK();

	private Integer quantidade;
	private Double preco;

	public PedidoItem() {

	}

	public PedidoItem(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
		super();
//		id.setPedido(pedido);
//		id.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}

	@JsonIgnore
//	public Pedido getPedido() {
////		return id.getPedido();
//	}

	public void setPedido(Pedido pedido) {
//		id.setPedido(pedido);
	}

//	public Produto getProduto() {
//		//return id//.getProduto();
//	}

//	public void setProduto(Produto produto) {
//		id.setProduto(produto);
//	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getSubtotal() {
		return preco * quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoItem other = (PedidoItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
