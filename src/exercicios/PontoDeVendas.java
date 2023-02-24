package exercicios;

import java.util.Scanner;

public class PontoDeVendas {
	public static void main(String[] args) {
		//variaveis
		double total, valorPago, troco, valorDesconto;
		int desconto;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Ponto de vendas");
		System.out.print("Valor total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto: ");
		desconto = teclado.nextInt();
		valorDesconto = total * desconto / 100;
		valorDesconto = total - valorDesconto;
		System.out.println("Total com desconto:" + valorDesconto);
		System.out.print("Valor pago: ");
		valorPago = teclado.nextDouble();
		troco = valorPago - valorDesconto;
		//processamento
		System.out.print("Troco:" + troco);
	}
}
