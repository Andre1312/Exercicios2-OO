package quesito09;

import java.util.Date;

public class Animal {

	// atributos
	private int id;
	private String nome;
	private char tipo;
	private Date dataNascimento;
	private Raca raca;
	private char genero;
	private String deficiencia;
	private boolean validado;
	private boolean castrado;
	private double tamanho;
	private double peso;
	private String temperamento;
	private String observacao;
	private Date dataResgate;
	
	// construtor
	public Animal(int id, String nome, char tipo, Date dataNascimento,
			Raca raca, char genero, String deficiencia, boolean validado,
			boolean castrado, double tamanho, double peso, String temperamento,
			String observacao, Date dataResgate) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.dataNascimento = dataNascimento;
		this.raca = raca;
		this.genero = genero;
		this.deficiencia = deficiencia;
		this.validado = validado;
		this.castrado = castrado;
		this.tamanho = tamanho;
		this.peso = peso;
		this.temperamento = temperamento;
		this.observacao = observacao;
		this.dataResgate = dataResgate;
	}
	
	// getters/setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getDeficiencia() {
		return deficiencia;
	}
	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}
	public boolean isValidado() {
		return validado;
	}
	public void setValidado(boolean validado) {
		this.validado = validado;
	}
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Date getDataResgate() {
		return dataResgate;
	}
	public void setDataResgate(Date dataResgate) {
		this.dataResgate = dataResgate;
	}
}
