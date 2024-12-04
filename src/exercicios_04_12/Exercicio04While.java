package exercicios_04_12;

import java.util.Scanner;

public class Exercicio04While {

    public static void main(String[] args) {
    	Scanner leia = new Scanner(System.in);
    	
    	
        String continua = "s";
        int idade = 0, genero = 0, dev = 0, back = 0, full = 0, mob = 0, front = 0, 
        		mC = 0, hC = 0, nB = 0, mT = 0, hT = 0, out = 0, 
        		somaIdade = 0, mF = 0, hM = 0, nBF = 0, i = 0 ;
         float media;
        
        

        while (!continua.equals("n")) {

            System.out.println("Qual a sua idade: ");
            idade = leia.nextInt();
            
            somaIdade += idade;

            System.out.println("\nQual sua Identidade de Gênero:");
            System.out.println("\n1 – Mulher Cis");
            System.out.println("2 – Homem Cis");
            System.out.println("3 – Não Binário");
            System.out.println("4 – Mulher Trans");
            System.out.println("5 – Homem Trans");
            System.out.println("6 – Outros");
            genero = leia.nextInt();
            leia.nextLine(); 



            System.out.println("\nPessoa Desenvolvedora:");
            System.out.println("\n1 – Backend");
            System.out.println("2 – Frontend");
            System.out.println("3 – Mobile");
            System.out.println("4 – FullStack");
            dev = leia.nextInt();
            leia.nextLine(); 
            
            if (genero == 1 ) {
            	mC = mC +1;
            }
            if (genero == 2 ) {
               hC = hC +1;         
            }
            if (genero == 3 ) {
                nB = nB +1;
            }
            if (genero == 4 ) {
                mT = mT +1;  
            }
            if (genero == 5 ) {
                hT = hT +1;
            }
            if (genero == 6 ) {
                out = out +1;  
            }
            
            // desenvolvedor
                
            if (dev == 1 ) {
            	back = back +1;
            }
            if (dev == 2 ) {
               front = front +1;         
            }
            if (dev == 3 ) {
                mob = mob +1;
            }
            if (dev == 4 ) {
                full = full +1;
            } 

            // Váriaveis para perguntas
            if ((genero == 1 || genero == 4) && dev == 2 ) {
            	mF ++;
            }

            if ((genero == 2 || genero ==5) && dev == 3 && idade > 40) {
            	hM ++;
            }
            
            if (genero == 3 && dev == 4 && idade < 30) {
            	nBF ++;
            }

            i ++;
            
            System.out.println("Deseja continuar a leitura dos dados de um novo colaborador ou não (s/n)");
            continua = leia.nextLine();
        }

        
        media = (float) somaIdade / i;
 
     
        System.out.println("Total de pessoas desenvolvedoras Backend:" + back);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mF);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + hM);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nBF);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + i);
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.1f", media);

    }
}
