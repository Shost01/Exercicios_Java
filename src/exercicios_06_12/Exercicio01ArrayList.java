package exercicios_06_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01ArrayList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		String cor;

		for (Integer i = 0; i < 5; i ++) {
			System.out.println("Digite uma cor: ");
			cor = leia.next();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: \n");
		for(String core : cores) {
			System.out.println(core);
		}
		
		cores.sort(null);
				
		System.out.println("\nOrdenar as cores: \n");		
		for(String core : cores) {
			System.out.println(core);
		}
	}
}
