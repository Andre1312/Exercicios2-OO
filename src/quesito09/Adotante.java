package quesito09;

public class Adotante {
	private int id;
	private String nome;
	private String telefoneFixo;
	private String email;
	private Endereco endereco;
	private boolean impedimento;
	private String motivoImpedimento;
	
	public Adotante(int id, String nome, String telefoneFixo, String email,
			Endereco endereco, boolean impedimento, String motivoImpedimento, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefoneFixo = telefoneFixo;
		this.email = email;
		this.endereco = endereco;
		this.impedimento = impedimento;
		this.motivoImpedimento = motivoImpedimento;
	}

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

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean isImpedimento() {
		return impedimento;
	}

	public void setImpedimento(boolean impedimento) {
		this.impedimento = impedimento;
	}

	public String getMotivoImpedimento() {
		return motivoImpedimento;
	}

	public void setMotivoImpedimento(String motivoImpedimento) {
		this.motivoImpedimento = motivoImpedimento;
	}
}
