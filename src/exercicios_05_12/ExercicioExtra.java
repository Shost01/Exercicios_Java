package exercicios_05_12;

import java.util.Scanner;

public class ExercicioExtra {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String palavras[] = {"pato", "ganso", "galinha"};
		String palavra;
		int posicao = -1;
			//Ordena o Vetor 
	
			
		System.out.println("Digite palavra que você deseja encontrar: ");
		palavra = leia.next();
			
		for (int i= 0; i < palavras.length; i++) {
				if(palavras[i].equals(palavra)) {
					 posicao = i;
				}
		}

		if(posicao != -1) {
			System.out.printf("A palavra %s está localizada na posição: %s", palavra, posicao );
		}
		else {
			System.out.printf("A palavra %s não foi encontrada!", palavra);
		}

	}

}
