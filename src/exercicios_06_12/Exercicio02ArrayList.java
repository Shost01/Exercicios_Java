package exercicios_06_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02ArrayList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<Integer> numero = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		
		Integer nS;

		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		nS = leia.nextInt();
		
		System.out.println("Lista de números");
		for (Integer n : numero) {
			System.out.print(n + " ");
		}
		
		if (numero.contains(nS)) {
			System.out.printf("\nO número %d está localizado na posição: %d", nS, numero.indexOf(nS));		
		}
		else {
			System.out.printf("\nO número %d não foi encontrado!", nS);
		}


	}

}
