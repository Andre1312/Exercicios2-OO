package quesito12;

public class RelogioImpl implements Relogio {

	// atributo
	private String marca;
	private String tipo;
	
	// construtor
	public RelogioImpl(String marca, String tipo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
	}
	//

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	// metodos da interface


	@Override
	public void ajustarHora() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void ajustarHora()");

	}

	@Override
	public void ajustarAlarme() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void ajustarAlarme()");


	}

	

}
