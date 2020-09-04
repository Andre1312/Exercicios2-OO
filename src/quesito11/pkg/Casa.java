package quesito11.pkg;

import java.util.ArrayList;

public class Casa extends ZonaEleitoral {

	// atributo
	private int numeroCasa;

	// construtor
	public Casa(String endereco, String cEP, ArrayList<Eleitor> eleitores, int numeroCasa) {
		super(endereco, cEP, eleitores);
		this.numeroCasa = numeroCasa;
	}
	
	// getters/setters 

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	
	
		
}
