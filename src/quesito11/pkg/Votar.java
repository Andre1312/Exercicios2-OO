package quesito11.pkg;

import java.util.Calendar;

public class Votar {
	
	// atributos
	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private String cargoCandidato;
	
	private ServidorDeVotos servidorDeVotos;

	//
	public Votar(int candidatoID, int eleitorID, Calendar data, String cargoCandidato,
			ServidorDeVotos servidorDeVotos) {
		super();
		this.candidatoID = candidatoID;
		this.eleitorID = eleitorID;
		this.data = data;
		this.cargoCandidato = cargoCandidato;
		this.servidorDeVotos = servidorDeVotos;
	}
	//

	public int getCandidatoID() {
	
		return this.candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	public int getEleitorID() {
		return eleitorID;
	}

	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getCargoCandidato() {
		return cargoCandidato;
	}

	public void setCargoCandidato(String cargoCandidato) {
		this.cargoCandidato = cargoCandidato;
	}

	public ServidorDeVotos getServidorDeVotos() {
		return servidorDeVotos;
	}

	public void setServidorDeVotos(ServidorDeVotos servidorDeVotos) {
		this.servidorDeVotos = servidorDeVotos;
	}
	
	//
	public void votar() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void votar()");
	}
	
	public void cancelar() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void cancelar()");
	}
	
}
