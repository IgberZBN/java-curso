package poo;

public class Fusca {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1968;
		fusca.cor = "Azul";
		System.out.println("Carro: fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("cor: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
		
	}

}
