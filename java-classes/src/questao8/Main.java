package questao8;

public class Main {
	
	public static void main(String[] args) {
		
		Televisao televisao = new Televisao();
		Controle controle = new Controle(televisao);
		
		System.out.println("Televisão ligada: " + televisao.isLigada());
		controle.consultarCanalEVolume();
		controle.ligaDesliga();
		System.out.println("Televisão ligada: " + televisao.isLigada());
		controle.consultarCanalEVolume();
		
		
	}

	

}
