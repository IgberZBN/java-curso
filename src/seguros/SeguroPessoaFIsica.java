package seguros;

import contas.Conta;

public class SeguroPessoaFIsica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFIsica cc3 = new SeguroPessoaFIsica();
		cc3.cliente = "Robson Almeida";
		cc3.saldo = 10000;
		System.out.println("Cliente: "+ cc3.cliente);
		cc3.exibirSaldo();

	}

}
