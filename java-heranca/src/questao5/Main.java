package questao5;

public class Main {
	
	public static void main(String[] args) {
		
		Quadrado cuadrado = new Quadrado("azul", 10);
		
		System.out.println("Cor: " + cuadrado.getCor());
		System.out.println("Lado: " + cuadrado.getLado());
		cuadrado.calcularArea();
		System.out.println("Área: " + cuadrado.getArea());
	}
}
