package quesito12;

public class RelogioPulso extends RelogioImpl implements Relogio {

	// atributo
	private int tipoPulsera;
	
	// construtor
	public RelogioPulso(String marca, String tipo, int tipoPulsera) {
		super(marca, tipo);
		this.tipoPulsera = tipoPulsera;
	}
	
	// getters/setters
	public int getTipoPulsera() {
		return tipoPulsera;
	}

	public void setTipoPulsera(int tipoPulsera) {
		this.tipoPulsera = tipoPulsera;
	}
	
}

