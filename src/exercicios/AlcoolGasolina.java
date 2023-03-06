package exercicios;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// variaveis
		double alcool, gasolina;
		// objetos
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("Alcool x Gasolina");
		System.out.print("Digite o valor do alcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		//processamento e saida
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com alcool");
		} else {
			System.out.println("Abastecer com gasolina");
		}
		teclado.close();
	}

}
