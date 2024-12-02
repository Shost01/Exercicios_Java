package exercicios_02_12;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Váriaveis
		String nome;
		float notaTotal;
		float nota1, nota2, nota3, nota4;
		float media;
	
		
		Scanner leia = new Scanner(System.in);
		
		// Pedir que insira nome e notas
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira a quarta nota: ");
		nota4 = leia.nextFloat();

		// Processamento
		notaTotal = nota1 + nota2 + nota3 + nota4;
		media = notaTotal / 4;
		
		// Saida dos dados
		System.out.println("Bom dia!, " + nome);
		System.out.printf("A sua média é %.1f.", media);
	}

}
