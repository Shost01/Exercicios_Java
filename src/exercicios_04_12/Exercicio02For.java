package exercicios_04_12;

import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {
		
        int i, n, par = 0, impar = 0;
        Scanner leia = new Scanner(System.in);
        
        
        for (i = 1; i < 11; i++) {
        	        	
            System.out.println("\nDigite o " + i + "º número: ");
            n = leia.nextInt();
            if (n % 2 == 0) {
            	par ++;
            }
            else {
            	impar ++;
            }
        }

    	System.out.println("Total de numero pares: " + par);
    	System.out.println("Total de numero impares: " + impar);
    	
        leia.close();
		
	}
	
}
