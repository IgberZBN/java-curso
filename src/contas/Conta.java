package contas;

public class Conta {
	//atributos
	protected String cliente;
	protected double saldo;
	//construcotr
	public Conta() {
		System.out.println("Agencia 0261");
	}
	//metodos
	protected void exibirSaldo() {
		System.out.println("Saldo: R$" + saldo);
	}
}
