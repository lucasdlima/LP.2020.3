package questao5;

public class Circulo extends FormaGeometrica{
	
	private float raio;

	public Circulo(String cor, float raio) {
		super(cor);
		this.setRaio(raio);
	}
	
	public void calcularArea() {
		float area = (this.raio * this.raio *  (float) 3.14); 
		this.setArea(area);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

}
