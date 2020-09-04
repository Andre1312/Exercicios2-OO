package quesito12;

public class RadioRelogio implements Radio,Relogio {

	// atributo
	private String marca;
	
	// construtor
	public RadioRelogio(String marca) {
		super();
		this.marca = marca;
	}
	// getters/setters
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
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

	@Override
	public void mudarEstacao() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void mudarEstacao()");
		
	}

	@Override
	public void tocar() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void tocar()");
	}

}
