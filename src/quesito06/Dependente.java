package quesito06;

public class Dependente {
	
	// Atributos
	private int sequencial;
	private String nomeCompleto;
	private Integer sexo;
	private String dataNascimento;
	private boolean participaPlano;
	private Funcionario funcionario;
	
	
	// Construtor
	public Dependente(int sequencial, String nomeCompleto, Integer sexo, String dataNascimento, boolean participaPlano,
			Funcionario funcionario) {
		super();
		this.sequencial = sequencial;
		this.nomeCompleto = nomeCompleto;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.participaPlano = participaPlano;
		this.funcionario = funcionario;
	}
	 
	// getters/setters
	public int getSequencial() {
		return sequencial;
	}
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Integer getSexo() {
		return sexo;
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public boolean isParticipaPlano() {
		return participaPlano;
	}
	public void setParticipaPlano(boolean participaPlano) {
		this.participaPlano = participaPlano;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
