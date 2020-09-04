package quesito11.pkg;

import java.util.ArrayList;

public class Resultado {
	
	//
	private int candidatoID;
	
	private ArrayList<ServidorDeVotos> servidores = new ArrayList<ServidorDeVotos>();

	//
	public Resultado(int candidatoID, ArrayList<ServidorDeVotos> servidores) {
		super();
		this.candidatoID = candidatoID;
		this.servidores = servidores;
	}

	// getters/setters
	public int getCandidatoID() {
		return candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	public ArrayList<ServidorDeVotos> getServidores() {
		return servidores;
	}

	public void setServidores(ArrayList<ServidorDeVotos> servidores) {
		this.servidores = servidores;
	}
	
	public int getTotalVotos() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"int getTotalVotos()");
		
		return 0;
	}
	
	public void divulgarVencedor() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void divulgarVencedor()");
	}

}
