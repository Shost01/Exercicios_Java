package exercicios_06_12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio04HashSet {

	public static void main(String[] args) {
		
		// Cria a Collection Set, do tipo String chamada setFrutas
		Set<Integer> numero = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);		
		Integer nS, posicao = Integer.valueOf(0);
		
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
			System.out.printf("\nO número %d foi encontrado! ", nS);		
		}
		else {
			System.out.printf("\nO número %d não foi encontrado! ", nS);
		}
	}
	
}
