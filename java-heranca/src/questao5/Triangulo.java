package questao5;

public class Triangulo extends FormaGeometrica{
	
	private float base;
	private float altura;
	
	public Triangulo(String cor, float base, float altura) {
		super(cor);
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public void calcularArea() {
		float area = (this.base * this.altura) / 2;
		this.setArea(area);
	}

	public float getBase() {
		return base;
	}
	
	public void setBase(float base) {
		this.base = base;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}

}
