package exercicios_05_12;

import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int n, posicao = -1;
			//Ordena o Vetor 
	
			
		System.out.println("Digite o número que você deseja encontrar: ");
		n = leia.nextInt();
			
		for (int i= 0; i < numeros.length; i++) {
				if(numeros[i] == n) {
					 posicao = i;
				}
		}

		if(posicao != -1) {
			System.out.printf("O número %d está localizado na posição: %d", n, posicao );
		}
		else {
			System.out.printf("O número %d não foi encontrado!", n);
		}
	}
}
