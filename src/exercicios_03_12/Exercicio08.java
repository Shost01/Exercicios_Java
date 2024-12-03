package exercicios_03_12;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		int opcao;
		float saldo = 1000f, valor=0f, saldoAtual = saldo;
	
		Scanner leia = new Scanner(System.in);

		System.out.println("Qual operação quer realizar: ");
		System.out.println("\n-- Digite 1 para ver o Saldo --");
		System.out.println("-- Digite 2 para realizar um saque--");
		System.out.println("-- Digite 3 para realizar um depósito --");
		opcao = leia.nextInt();
		if (opcao == 2 || opcao == 3 ) {
			System.out.println("Digite o valor desejado: ");
			valor = leia.nextFloat();
		}
		
		switch (opcao) {
		case 1:
			System.out.printf("Saldo: %.1f", saldoAtual);
			break;
		case 2:
			saldoAtual = saldo - valor;
			if (valor > saldo) {
				System.out.printf("Saldo insuficiente!");			
			}
			else {
				System.out.printf("Saldo atual é %.1f", saldoAtual);
			}

			break;
		case 3:
			saldoAtual = saldo + valor;
			System.out.printf("Saldo atual é %.1f", saldoAtual);
			break;

		default:
			System.out.println("Opção inválida!");
		}

		leia.close();

	}

}
