package questao8;

public class Controle {
	
	private Televisao televisao;
	
	public Controle(Televisao televisao) {
		this.setTelevisao(televisao);
	}
	
	public void ligaDesliga() {
		if(this.televisao.isLigada() == true) {
			this.televisao.setLigada(false);
		}else {
			this.televisao.setLigada(true);
		}	
	}
	
	public void upVolume() {
		int x = this.televisao.getVolume();
		x += 1;
		this.televisao.setVolume(x);
	}
	
	public void downVolume() {
		int x = this.televisao.getVolume();
		x -= 1;
		this.televisao.setVolume(x);
	}
	
	public void upCanal() {
		int x = this.televisao.getCanal();
		x += 1;
		this.televisao.setCanal(x);
	}
	
	public void downCanal() {
		int x = this.televisao.getCanal();
		x -= 1;
		this.televisao.setCanal(x);
	}
	
	public void trocarCanal(int canal) {
		this.televisao.setCanal(canal);
	}
	
	public void consultarCanalEVolume() {
		System.out.println("Canal: " + this.televisao.getCanal() + "  Volume: " + this.televisao.getVolume());
	}
	public Televisao getTelevisao() {
		return this.televisao;
	}
	
	public void setTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}
}
