package exercicios_02_12;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		// Váriaveis
		String nome;
		float salarioB;
		float salarioL;
		float adicionalN;
		float horasExtras;
		float descontos;
		
		Scanner leia = new Scanner(System.in);
		
		// Pedir que insira nome e dados para realizar a conta
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira valor do salário Bruto: ");
		salarioB = leia.nextFloat();
		
		System.out.println("Insira o valor do adicional Noturno: ");
		adicionalN = leia.nextFloat();
		
		System.out.println("Insira o valor das horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("por último insira os descontos: ");
		descontos = leia.nextFloat();
				
		// Processamento
		salarioL = salarioB + adicionalN + (horasExtras * 5) - descontos ;
		
		// Saida dos dados
		System.out.println("Olá, " + nome);
		System.out.printf("O valor do salário liquido é %.1f.", salarioL);
		
	}
}
