package exercicios_06_12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio03HashSet {

	public static void main(String[] args) {

	
		Set<Integer> numerosInteiros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		Integer n;

		for (Integer i = 0; i < 10; i ++) {
			System.out.println("Digite um número inteiro sem repetir: ");
			n = leia.nextInt();
			numerosInteiros.add(n);
		}
		
		System.out.println("\nListar dados do Set: \n");
		for (Integer num : numerosInteiros) {
			System.out.println(num);
		}

	}

}
