package exercicios_03_12;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {

		int opcao;
		float n1, n2, total;
	
		Scanner leia = new Scanner(System.in);

		System.out.println("Qual operação quer realizar: ");
		System.out.println("\n-- Digite 1 Soma --");
		System.out.println("-- Digite 2 Subtração--");
		System.out.println("-- Digite 3 para Multiplicação --");
		System.out.println("-- Digite 4 para Divisão --");
		opcao = leia.nextInt();
		
		System.out.println("Digite o Primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		switch (opcao) {
		case 1:
			total = n1 + n2;
			System.out.printf("%.1f + %.1f = %.1f", n1, n2, total);
			break;
		case 2:
			total = n1 - n2;
			System.out.printf("%.1f - %.1f = %.1f", n1, n2, total);
			break;
		case 3:
			total = n1 * n2;
			System.out.printf("%.1f * %.1f = %.1f", n1, n2, total);
			break;
		case 4:
			total = n1 / n2;
			System.out.printf("%.1f / %.1f = %.1f", n1, n2, total);
			break;

		default:
			System.out.println("Opção inválida!");
		}

		leia.close();
	}

}
