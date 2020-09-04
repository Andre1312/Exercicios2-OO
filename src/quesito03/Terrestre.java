package quesito03;

public class Terrestre extends MeioDeTransporte{
	
	// atributos
	private int qtdeRodas;
	private double potencia;
		
	// construtor
	public Terrestre(int id, short ano, String modelo, double carga_maxima, int qtdeRodas, double potencia) {
		super(id, ano, modelo, carga_maxima);
		this.qtdeRodas = qtdeRodas;
		this.potencia = potencia;
	}

	// getters/setters
	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public double consumo() {
		// TODO Auto-generated method stub
		return (super.getCarga_maxima() * this.potencia * 100.0);
	}
	
	
	

}
