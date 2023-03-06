package exercicios;

import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		// variaveis
		double hora, remuneracao, custo, cargaHoraria;
		// objetos
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("Calculo do valor da hora de um servico");
		System.out.print("Remuneracao mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.println("Custo peracional mensal: ");
		custo = teclado.nextDouble();
		System.out.println("Carga horaria mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		// processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		// saida
		System.out.println("Valor da hora: " + hora);
		teclado.close();
	}

}
