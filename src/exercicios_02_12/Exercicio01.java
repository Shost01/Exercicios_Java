package exercicios_02_12;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Váriaveis
		int salario;
		int abono;
		int novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		// Pedir que insira salário e abono
		System.out.println("Insira o seu salário: ");
		salario = leia.nextInt();
		
		System.out.println("Insira o abono: ");
		abono = leia.nextInt();
				
		// Processamento
		novoSalario = salario + abono;
		
		// Saida dos dados
		System.out.printf("O sálario mais o abono é %d.%n.", novoSalario);

	}

}
