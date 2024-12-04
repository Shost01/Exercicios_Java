package exercicios_04_12;

import java.util.Scanner;

public class Exercicio01For {
	
	public static void main(String[] args) {
		
        int i, n1, n2;
       
        Scanner leia = new Scanner(System.in);
        
    	System.out.println("Digite o primeiro número do intervalo: ");
    	n1 = leia.nextInt();
    	
    	System.out.println("Digite o último número do intervalo: ");
    	n2 = leia.nextInt();
        
        for (i = n1; i < n2; i++) {
              	
        	if(i % 3 == 0 && i % 5 == 0) {
        		System.out.printf("%d è múltiplo de 3 e 5\n", i);
        	}
        }
        
    	if (n1 > n2) {
    		System.out.println("Intervalo inválido!");   		
    	}
        
        leia.close();
		
	}

}


