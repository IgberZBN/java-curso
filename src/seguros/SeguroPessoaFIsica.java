package seguros;

import contas.Conta;

public class SeguroPessoaFIsica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFIsica cc3 = new SeguroPessoaFIsica();
		cc3.setCliente("Robson Almeida");
		cc3.setSaldo(10000);
		System.out.println("Cliente: "+ cc3.getCliente());
		cc3.exibirSaldo();

	}

}
