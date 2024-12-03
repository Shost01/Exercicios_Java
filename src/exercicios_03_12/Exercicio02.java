package exercicios_03_12;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		// variáveis
		int n1;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
	
		// Processamento

		if ( n1 >= 0 && n1 % 2 == 0 ) {
			System.out.printf("O Número %d é par e positivo!", n1);
		}
		else if ( n1 < 0 && n1 % 2 == 0 ) {
			System.out.printf("O Número %d é par e negativo!", n1);	
		}
		else if ( n1 >= 0 && n1 % 2 > 0) {
			System.out.printf("O Número %d é ímpar e positivo!", n1);	
		}
		 else {
			System.out.printf("O Número %d é impar e negativo!", n1);
		}


		leia.close();
		
	}

}
