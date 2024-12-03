package exercicios_03_12;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		// variáveis
		int valorA, valorB, valorC, valorAB;
		
		

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite o primeiro numero (A): ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o segundo numero (B): ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o terceiro numero (C): ");
		valorC = leia.nextInt();
		
		valorAB = valorA + valorB;
		
		// Processamento

		if ( valorAB > valorC) {
			System.out.println("A Soma d A + B é Maior do que C");
		} else if (valorAB < valorC) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}

		leia.close();
		
	}

}
