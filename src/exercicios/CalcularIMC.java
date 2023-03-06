package exercicios;

import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		// variaveis
		double imc, altura, peso;
		// objeto
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();
		// processamento
		imc = peso / (altura * altura);
		// saida
		System.out.println("IMC: " + imc);
		// classificacao
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Peso Ideal");
		} else if (imc < 30) {
			System.out.println("Levemente acima do peso");
		} else if (imc < 35) {
			System.out.println("Obesidade grau 1");
		} else if (imc < 40) {
			System.out.println("Obesidade grau 2");
		} else {
			System.out.println("Obesidade grau 3");
		}

	}

}
