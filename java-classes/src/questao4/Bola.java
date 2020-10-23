package questao4;

public class Bola {
	
	private String cor;
	private float tam;
	private boolean bola;
	
	public Bola(String cor, float tam) {
		this.setCor(cor);
		this.setTam(tam);
		this.setBola(false);
		
	}
	
	public void encher() {
		if (this.isBola() == false) {
			this.bola = true;
		}
	}
	public void esvaziar() {
		if (this.isBola() == true) {
			this.bola = false;
		}
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getTam() {
		return tam;
	}
	public void setTam(float tam) {
		this.tam = tam;
	}
	public boolean isBola() {
		return bola;
	}
	public void setBola(boolean bola) {
		this.bola = bola;
	}
	
	
	

}
