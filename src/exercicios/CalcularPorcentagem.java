package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularPorcentagem {
	public static void main(String[] args) {
		//variaveis
		double x, y, porcentagem;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada
		System.out.println("Calcular porcentagem");
		System.out.print("Insira o valor principal: ");
		x = teclado.nextDouble();
		System.out.println("Insira a porcentagem que deseja saber: ");
		y = teclado.nextDouble();
		//processamento
		porcentagem = x * y / 100; 
		System.out.println(y + "% de " + x + " = " + formatador.format(porcentagem));
		teclado.close();
	}
}
