package quesito11.pkg;

import java.util.ArrayList;

public class Eleitor extends Pessoa{

	// atributos
	private String endereco;
	private int eleitorID;

	private ZonaEleitoral zonaEleitoral;

	private ArrayList<Votar> votos = new ArrayList<Votar>();

	// construtor
	public Eleitor(String nome, boolean pessoaJuridica, String cpf, String endereco, int eleitorID,
			ZonaEleitoral zonaEleitoral, ArrayList<Votar> votos) {
		super(nome, pessoaJuridica, cpf);
		this.endereco = endereco;
		this.eleitorID = eleitorID;
		this.zonaEleitoral = zonaEleitoral;
		this.votos = votos;
	}
	
	// getters/setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getEleitorID() {
		return eleitorID;
	}

	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}

	public ZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}



	public ArrayList<Votar> getVotos() {
		return votos;
	}



	public void setVotos(ArrayList<Votar> votos) {
		this.votos = votos;
	}

	// métodos
	
	public int validar() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"int validar()");
		
		return 0;
	}
	
	



}
