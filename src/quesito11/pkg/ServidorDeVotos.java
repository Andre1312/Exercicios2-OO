package quesito11.pkg;

import java.util.ArrayList;
import java.util.Calendar;

public class ServidorDeVotos {
	
	// atributos
	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private int contaVotos;
	
	private ArrayList<Votar> votos = new ArrayList<Votar>();
	
	private ArrayList<Resultado> resultados = new ArrayList<Resultado>();

	// construtor
	public ServidorDeVotos(int candidatoID, int eleitorID, Calendar data, int contaVotos, ArrayList<Votar> votos,
			ArrayList<Resultado> resultados) {
		super();
		this.candidatoID = candidatoID;
		this.eleitorID = eleitorID;
		this.data = data;
		this.contaVotos = contaVotos;
		this.votos = votos;
		this.resultados = resultados;
	}

	// getters/setters
	public int getCandidatoID() {
		return candidatoID;
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

	public int getContaVotos() {
		return contaVotos;
	}

	public void setContaVotos(int contaVotos) {
		this.contaVotos = contaVotos;
	}

	public ArrayList<Votar> getVotos() {
		return votos;
	}

	public void setVotos(ArrayList<Votar> votos) {
		this.votos = votos;
	}

	public ArrayList<Resultado> getResultados() {
		return resultados;
	}

	public void setResultados(ArrayList<Resultado> resultados) {
		this.resultados = resultados;
	}
	
	//
	public int contaVotos() {
		
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"int contaVotos()");
		
		return 0;
		
	}
	
	
}
