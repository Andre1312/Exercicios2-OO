package quesito09;

public class PessoaJuridica {
	
	// atributos
	private int id;
	private String cnpj;
	private PessoaFisica responsavel;
	private Adotante adotante;
	
	// construtor
	public PessoaJuridica(int id, String cnpj, PessoaFisica responsavel,
			Adotante adotante) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.responsavel = responsavel;
		this.adotante = adotante;
	}
	
	// getters/setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public PessoaFisica getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}
	public Adotante getAdotante() {
		return adotante;
	}
	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
}
