package exercicios_02_12;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// Váriaveis
		String nome;
	
		float n1, n2, n3, n4;
		float diferenca;
	
		
		Scanner leia = new Scanner(System.in);
		
		// Pedir que insira numeros
	
		System.out.println("Insira o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o quarto número: ");
		n4 = leia.nextFloat();

		// Processamento
	
		diferenca = (n1 * n2) - (n3 * n4);
		
		// Saida dos dados

		System.out.printf("A sua média é %.1f.", diferenca);
	}

}
