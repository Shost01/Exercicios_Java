package exercicios_05_12;

import java.util.Scanner;

public class Exercicio02Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int soma = 0;
		float media;
		
		System.out.print("Elementos nos índices ímpares: \n");
		for (int i= 0; i < numeros.length; i++) {
			// soma dos números!
			soma += numeros[i];
			
				if (i % 2 != 0) {
					System.out.print(numeros[i] + " ");
				}		
		}
		
		System.out.print("Elementos pares: \n");
		for (int i= 0; i < numeros.length; i++) {
		
			if (i % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}		
	}

		media = (float) soma / numeros.length;

		System.out.println("Soma: " + soma );
		System.out.printf("Média: %.2f", media);
	}
}
