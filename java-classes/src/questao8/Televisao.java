package questao8;

public class Televisao {
	
	private int canal;
	private int volume;
	private boolean ligada;
	
	public Televisao() {
		this.canal = 10;
		this.volume = 50;
	}

	public int getCanal() {
		if (this.ligada == true) {
			return this.canal;
		}else {
			return 0;
		}
		
	}

	public void setCanal(int canal) {
		if (this.ligada == true) {
			this.canal = canal;
		}
	}

	public int getVolume() {
		if (this.ligada == true) {
			return this.volume;
		}else {
			return 0;
		}
	}

	public void setVolume(int volume) {
		if (this.ligada == true) {
			if (0 <= volume && volume <= 100) {
				this.volume = volume;
			}
		}
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

}
