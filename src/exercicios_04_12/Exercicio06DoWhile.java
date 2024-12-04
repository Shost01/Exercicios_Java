package exercicios_04_12;

import java.util.Scanner;

public class Exercicio06DoWhile {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

		
        int numero, soma = 0, i = 0;
        float  media = 0;

        do {
            System.out.println("\nDigite um número: ");
            numero = leia.nextInt();
            
            if (numero % 3 == 0 && numero != 0) {
            	i ++;
            	soma += numero ;
            	
            }
            

        } while (numero != 0);

        if(i > 0) {
        	media = (float) soma / i;
            System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
        }

        leia.close();
	}

}
