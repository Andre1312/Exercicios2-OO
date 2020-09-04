package quesito11.pkg;

public class Pessoa {
	
	// atributo
	private String nome;
	private boolean pessoaJuridica;
	private String cpf;
	
	// construtor
	public Pessoa(String nome, boolean pessoaJuridica, String cpf) {
		super();
		this.nome = nome;
		this.pessoaJuridica = pessoaJuridica;
		this.cpf = cpf;
	}

	// getters/setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(boolean pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
