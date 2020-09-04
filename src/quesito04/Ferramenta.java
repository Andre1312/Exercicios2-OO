package quesito04;

public class Ferramenta extends ItemDeLoja{

	// atributos
	private String categoria;
	private int serial;

	// construtor
	public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, String categoria, int serial) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.categoria = categoria;
		this.serial = serial;
	}

	// getters/setter
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}

	// metodos especificos

	/**
	 * Retornar o identificador para Ferramenta
	 * @return serial : int
	 */
	@Override
	public int getIdentificador() {
		return serial;
	} 

	/**
	 * <p>Registrar a categoria em que foi armazenado o produto.</p>
	 * <p> Se a informação não for passada, o registro será feito na categoria “Outros”</p>
	 */
	public void separar() {
		this.setCategoria("Outros");
	}
	/**
	 * <p>Registrar a categoria em que foi armazenado o produto.</p>
	 * <p> Se a informação não for passada, o registro será feito na categoria “Outros”</p>
	 * @param valor : String
	 */
	public void separar(String valor) {
		this.setCategoria(valor);
	}
	
}
