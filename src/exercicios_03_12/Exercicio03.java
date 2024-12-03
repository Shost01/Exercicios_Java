package exercicios_03_12;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// variáveis
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Esta é sua primeira doação (digite true para sim e false para não): ");
		primeiraDoacao = leia.nextBoolean();		


		
		// Processamento

		if (idade >= 18 && idade < 60) {
			System.out.printf("%s está apta para doar sangue!", nome);		
			}
		else if (idade >= 60 && idade<=69 && primeiraDoacao == false) {
			System.out.printf("%s está apta para doar sangue!", nome);	
		}
		 else {
			System.out.printf("%s não está apto para doar sangue!", nome);
		}

		leia.close();
	}

}
