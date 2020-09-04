package quesito02;

import java.util.Date;

public class Produto {
	
	// atributos
	private Integer id;
	private String nome;
	private String descricao;
	private Date validade;
	
	// construtor
	public Produto(Integer id, String nome, String descricao, Date validade) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.validade = validade;
	}

	// getters/setters
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getValidade() {
		return this.validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	// metodos especificos
	
	/**
	 * Retorna o id do produto
	 * @return id : Integer
	 */
	public Integer getCod() {
		return this.id;
	}

	
}
