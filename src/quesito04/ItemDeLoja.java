package quesito04;

public class ItemDeLoja {
	
	// atributos
	private int codigoDoItem;
	private String nomeDoItem;
	private String descricaoDoItem;
	private double valorDoItem;
	
	// construtor
	public ItemDeLoja(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		this.codigoDoItem = codigoDoItem;
		this.nomeDoItem = nomeDoItem;
		this.descricaoDoItem = descricaoDoItem;
		this.valorDoItem = valorDoItem;
	}
	
	// getters/setters

	public int getCodigoDoItem() {
		return codigoDoItem;
	}

	public void setCodigoDoItem(int codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}

	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}

	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
	}

	public double getValorDoItem() {
		return valorDoItem;
	}

	public void setValorDoItem(double valorDoItem) {
		this.valorDoItem = valorDoItem;
	}
	
	
	
	// metodos especificos
	
	/**
	 * Retornar o identificador para ItemDeLoja
	 * @return codigoDoItem : int
	 */
	public int getIdentificador() {
		return codigoDoItem;
	}
	
	
	
	
}
