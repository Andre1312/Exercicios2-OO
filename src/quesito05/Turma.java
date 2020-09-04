package quesito05;

import java.util.List;

public class Turma {
	
	// atributos
	private String cod;
	private Integer turno;
	private Integer sala;
	private List<Aluno> alunos;
	
	// construtor
	public Turma(String cod, Integer turno, Integer sala, List<Aluno> alunos) {
		
		this.cod = cod;
		this.turno = turno;
		this.sala = sala;
		this.alunos = alunos;
	}
	
	// getters/setters
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}
