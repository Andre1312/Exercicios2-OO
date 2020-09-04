package quesito09;

public class Raca {

	// atributos
	private int id;
	private String origem;
	private double tamanhoMax;
	private int expectativaVida;
	private int temperamento;

	// construtor
	public Raca(int id, String origem, double tamanhoMax, int expectativaVida,
			int temperamento) {
		super();
		this.id = id;
		this.origem = origem;
		this.tamanhoMax = tamanhoMax;
		this.expectativaVida = expectativaVida;
		this.temperamento = temperamento;
	}

	// getters/setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public double getTamanhoMax() {
		return tamanhoMax;
	}

	public void setTamanhoMax(double tamanhoMax) {
		this.tamanhoMax = tamanhoMax;
	}

	public int getExpectativaVida() {
		return expectativaVida;
	}

	public void setExpectativaVida(int expectativaVida) {
		this.expectativaVida = expectativaVida;
	}

	public int getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(int temperamento) {
		this.temperamento = temperamento;
	}
}
