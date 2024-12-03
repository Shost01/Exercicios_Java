package exercicios_03_12;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		int opcao;
		int qtd, preco;
		int total;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n-- Digite 1 para Cachorro Quente --");
		System.out.println("-- Digite 2 para X-Salada --");
		System.out.println("-- Digite 3 para X-Bacon --");
		System.out.println("-- Digite 4 para Bauru --");
		System.out.println("-- Digite 5 para Refrigerante --");
		System.out.println("-- Digite 6 para Suco de Laranja --");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("O preço é R$10.00");
			preco = 10;
			System.out.println("Quantos vai querer?: ");
			qtd = leia.nextInt();
			
			total = qtd * preco;
			
			System.out.printf("O valor total é %d ", total);
			break;
		case 2:
			System.out.println("O preço é R$15.00");
			preco = 15;
			System.out.println("Quantos vai querer?: ");
			qtd = leia.nextInt();
			
			total = qtd * preco;
			
			System.out.printf("O valor total é %d ", total);
			break;
		case 3:
			System.out.println("O preço é R$18.00");
			preco = 18;
			System.out.println("Quantos vai querer?: ");
			qtd = leia.nextInt();
			
			total = qtd * preco;
			
			System.out.printf("O valor total é %d ", total);
			break;
		case 4:
			System.out.println("O preço é R$12.00");
			preco = 12;
			System.out.println("Quantos vai querer?: ");
			qtd = leia.nextInt();
			
			total = qtd * preco;
			
			System.out.printf("O valor total é %d ", total);
			break;
		case 5:
			System.out.println("O preço é R$8.00");
			preco = 8;
			System.out.println("Quantos vai querer?: ");
			qtd = leia.nextInt();
			
			total = qtd * preco;
			
			System.out.printf("O valor total é %d ", total);
			break;
		case 6:
			System.out.println("O preço é R$13.00");
			preco = 13;
			System.out.println("Quantos vai querer?: ");
			qtd = leia.nextInt();
			
			total = qtd * preco;
			
			System.out.printf("O valor total é %d ", total);
			break;
		default:
			System.out.println("Opção inválida!");
		}

	}

}
