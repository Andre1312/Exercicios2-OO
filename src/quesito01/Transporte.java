package quesito01;

/**
 * 
 * 
 * @author alcb
 * 
 * Exercicios 2 OO
 * 1 Quesito
 * Classe Transporte
 *
 *
 *
 */


public class Transporte {
	
	// atributos
	private Integer id;
	private Integer ano;
	private String modelo;
	private Double carga_maxima;
	private Double potencia;
	
	// construtor padrão
	public Transporte() {
		id = Integer.valueOf(1);
		ano = Integer.valueOf(1976);
		modelo = "Chevy A10";
		carga_maxima = Double.valueOf(500.0);
		potencia = Double.valueOf(85.0);
	}
	
	// construtor 
	public Transporte(Integer id, Integer ano, String modelo, Double cargaMax, Double potencia) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = cargaMax;
		this.potencia = potencia;
	}
	
	// getters/setters
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getAno() {
		return this.ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getCarga_maxima() {
		return this.carga_maxima;
	}

	public void setCarga_maxima(Double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	public Double getPotencia() {
		return this.potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	
	// metodos especificos 
	
	/**
	 * Retorna o modelo do transporte
	 * @return modelo: String
	 */
	public String leiaModelo() {
		return this.modelo;
	}
		
	/**
	 * Grava o modelo do transporte
	 * @param modelo : String
	 */
	public void gravaModelo(String modelo) {
		this.modelo = modelo;
	}
		
	/**
	 * Retorna o Consumo = cargaMaxima x potencia x 100
	 * @return consumo: Double
	 */
	public double consumo() {
	
		return (this.carga_maxima) * (this.potencia) * 100;
	}
	
	
}
