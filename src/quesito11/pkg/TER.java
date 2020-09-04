package quesito11.pkg;

import java.util.ArrayList;

public class TER extends ZonaEleitoral {
	
	// atributo
	private int numeroZona;

	// construtor
	public TER(String endereco, String cEP, ArrayList<Eleitor> eleitores, int numeroZona) {
		super(endereco, cEP, eleitores);
		this.numeroZona = numeroZona;
	}

	// getters/setters
	public int getNumeroZona() {
		return numeroZona;
	}

	public void setNumeroZona(int numeroZona) {
		this.numeroZona = numeroZona;
	}
	
	

}
