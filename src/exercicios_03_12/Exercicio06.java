package exercicios_03_12;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {

		String nome;
		int opcao;
		float salario, total, reajuste;
	
		Scanner leia = new Scanner(System.in);

		System.out.println("Qual seu Nome: ");
		nome = leia.next();
		
		System.out.println("Qual Seu Cargo: ");
		System.out.println("\n-- Digite 1 para Gerente --");
		System.out.println("-- Digite 2 para Vendedor--");
		System.out.println("-- Digite 3 para Supervisor --");
		System.out.println("-- Digite 4 para Motorista --");
		System.out.println("-- Digite 5 para Estoquista --");
		System.out.println("-- Digite 6 para técnico de TI --");
		opcao = leia.nextInt();
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		switch (opcao) {
		case 1:
			reajuste = 0.1f;
			total = salario + (salario * reajuste);
			System.out.printf("Gerente %s, seu sálário com o reajuste é %.2f ", nome,total);
			break;
		case 2:
			reajuste = 0.07f;
			total = salario + (salario * reajuste);
			System.out.printf("Vendedor %s, seu sálário com o reajuste é %.2f ", nome,total);
			break;
		case 3:
			reajuste = 0.09f;
			total = salario + (salario * reajuste);
			System.out.printf("Supervisor %s, o seu sálário com o reajuste é %.2f ", nome, total);
			break;
		case 4:
			reajuste = 0.06f;
			total = salario + (salario * reajuste);
			System.out.printf("Motorista %s, o seu sálário com o reajuste é %.2f ", nome,total);
			break;
		case 5:
			reajuste = 0.05f;
			total = salario + (salario * reajuste);
			System.out.printf("Estoquista %s, o seu sálário com o reajuste é %.2f ", nome,total);
			break;
		case 6:
			reajuste = 0.08f;
			total = salario + (salario * reajuste);
			System.out.printf("Técnico de TI %s, o seu sálário com o reajuste %.2f ", nome, total);
			break;
		default:
			System.out.println("Opção inválida!");
		}

		leia.close();
	}

}
