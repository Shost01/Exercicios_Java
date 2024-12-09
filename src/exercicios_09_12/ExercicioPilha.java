package exercicios_09_12;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		// Criando a Collection de Pilha
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);	

		Integer opcao;
		String livro;
		

		do {
			
			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar um livro da pilha ");
			System.out.println("0 - Sair");
			System.out.println("\n# ## ### #### ############################# #### ### ## #");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				livro = leia.nextLine();
				pilha.push(livro);
				
				// Mostrando a pilha
				System.out.println("Pilha: \n");
                for (String l : pilha) {
                    System.out.println(l);
                }
                
                System.out.println("\nLivro adicionado! \n");
				

				break;
			case 2:   
				if (!pilha.isEmpty()) {
					System.out.println("Lista de Livros na Pilha: \n");
	                for (String l : pilha) {
	                    System.out.println(l);
	                }
				}
				else {
					System.out.println("A pilha está vazia! \n");
				}

				break;
			case 3:
				if (!pilha.isEmpty()) {
					// Mostrando a pilha
					System.out.println("Pilha: \n");
                    for (String l : pilha) {
                        System.out.println(l);
                    }
                    
					System.out.println("\nO Livro " + pilha.pop() + " foi retirado da pilha! \n");
					
				}
				else {
					System.out.println("A pilha está vazia! \n");
				}
				
				break;
			case 0:
				System.out.println("Programa finalizado!");

				
				break;
				
			default:
				System.out.println("Opção inválida!");
			}		

		} while (opcao != 0);	
		

	}

}
