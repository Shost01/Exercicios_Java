package exercicios_04_12;

import java.util.Scanner;

public class Exercicio05DoWhile {

	public static void main(String[] args) {
		
        int numero, soma = 0, i = 0;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número: ");
            numero = leia.nextInt();
            if (numero > 0) {
            	soma += numero ;
            }
            

        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + soma);
        
	}

}
