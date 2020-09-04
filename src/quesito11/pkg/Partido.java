package quesito11.pkg;

import java.util.ArrayList;

public class Partido {
	
	// atributo
	private String nome;
	private String sigla;
	
	ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
	
	// construtor
	public Partido(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	// getters/setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
	
	
}
