package questao5;

public class Quadrado extends FormaGeometrica {	
	
	private float lado;

	public Quadrado(String cor, float lado) {
		super(cor);
		this.setLado(lado);
	}
	
	public void calcularArea() {
		float area = this.lado * this.lado;
		this.setArea(area);
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

}
