package exercicios_04_12;

import java.util.Scanner;

public class Exercicio03While {

	public static void main(String[] args) {

		int idade = 0, i = 0, j = 0;
		Scanner leia = new Scanner(System.in);

		while (true) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade <0) {
				break;
			}
				
			if (idade < 21) {
				 i ++;
			}
			if (idade > 50) {
				j ++;
			}

		}

		System.out.println("Total de pessoas menores de 21 anos: " + i);
		
		System.out.println("Total de pessoas maiores de 50 anos: " + j);
		
	}
}
