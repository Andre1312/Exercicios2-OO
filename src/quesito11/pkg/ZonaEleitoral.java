package quesito11.pkg;

import java.util.ArrayList;

public class ZonaEleitoral {
	
	// atributo
	private String endereco;
	private String CEP;
	
	private ArrayList<Eleitor> eleitores = new ArrayList<Eleitor>();

	// construtor
	public ZonaEleitoral(String endereco, String cEP, ArrayList<Eleitor> eleitores) {
		super();
		this.endereco = endereco;
		this.CEP = cEP;
		this.eleitores = eleitores;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCEP() {
		return this.CEP;
	}

	public void setCEP(String cEP) {
		this.CEP = cEP;
	}

	public ArrayList<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(ArrayList<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}
	
	
	
	
}
