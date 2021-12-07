package org.MinhaLojadeGames.MinhaLojadeGames.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;

	@NotBlank
	@Size(min = 5, max = 30)
	private String nomeProduto;

	@NotBlank
	@Size(min = 5, max = 500)
	private String descricaoProduto;

	@NotNull
	private double precoProduto;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_categoria")
	private Categoria categoriaGame;
	
	

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Categoria getCategoriaGame() {
		return categoriaGame;
	}

	public void setCategoriaGame(Categoria categoriaGame) {
		this.categoriaGame = categoriaGame;
	}

}
