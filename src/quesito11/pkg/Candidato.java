package quesito11.pkg;

public class Candidato extends Pessoa {
	
	// atributos
	private int candidatoID;
	private String cargo;
	private String partido;
	private boolean resultado;
	private String uf;
	
	private Votar votar;
	
	// construtor

	public Candidato(String nome, boolean pessoaJuridica, String cpf, int candidatoID, String cargo, String partido,
			boolean resultado, String uf, Votar votar) {
		super(nome, pessoaJuridica, cpf);
		this.candidatoID = candidatoID;
		this.cargo = cargo;
		this.partido = partido;
		this.resultado = resultado;
		this.uf = uf;
		this.votar = votar;
	}
	
	// getters/setters
	public int getCandidatoID() {
		return candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Votar getVotar() {
		return votar;
	}

	public void setVotar(Votar votar) {
		this.votar = votar;
	}
	
	//
	public int candidatura() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"int candidatura()");
		
		return 0;
	}
	
}
