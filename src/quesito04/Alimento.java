package quesito04;

public class Alimento extends ItemDeLoja{
	
	
	// atributo
	private Integer selo;
	
	//construtor
	public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, Integer selo) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.selo = selo;
	}

	
	// getters/setters
	public Integer getSelo() {
		return selo;
	}
	
	public void setSelo(Integer selo) {
		this.selo = selo;
	}

	
	/**
	 * Retornar o identificador para Alimento
	 * @return selo : int
	 */
	@Override	
	public int getIdentificador() {
		return this.getSelo();
	}
}
