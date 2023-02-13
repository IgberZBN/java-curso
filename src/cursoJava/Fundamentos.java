package cursoJava;

public class Fundamentos {

	public static void main(String[] args) {
//		String nome = "Gabriel Benitez";
		
		String nome;
		int idade = 18;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
				
		nome = "Gabriel Benitez";
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(sexo);
		System.out.println(temperatura);
		System.out.println(arCondicionado);
		
		System.out.println("---------------------");
		System.out.println("");
		
		double i = 10;
		System.out.println("Operadores Aritmeticos e Atribuicoes");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i +=         | i = " + (i += 5));
		System.out.println("i -=         | i = " + (i -= 5));
		System.out.println("i *=         | i = " + (i *= 5));
		System.out.println("i /=         | i = " + (i /= 5));
	}

}
