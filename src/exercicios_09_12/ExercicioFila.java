package exercicios_09_12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);	
		Integer opcao;
		String nome;
		

		do {
			
			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos o Clientes");
			System.out.println("3 - Retirar Client da Fila");
			System.out.println("0 - Sair");
			System.out.println("\n# ## ### #### ############################# #### ### ## #");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				fila.add(nome);
				
				// mostrando fila
				System.out.println("Fila: \n");
                for (String c : fila) {
                    System.out.println(c);
                }
                
				System.out.println("\nCliente aicionado! \n");
				

				break;
			case 2:    
				if(!fila.isEmpty()) {
					System.out.println("Lista de clientes na Fila: \n");
	                for (String c : fila) {
	                    System.out.println(c);
	                }
				}
				else {
					System.out.println("A Fila está vazia! \n");
				}
				break;
			case 3:
				if (!fila.isEmpty()) {	
					
					fila.poll();
					// mostrando fila
					System.out.println("Fila: \n");
	                for (String c : fila) {
	                    System.out.println(c);
	                }
					
					System.out.println("O cliente foi chamado!");
					
				}
				else {
					System.out.println("A Fila está vazia! \n");
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
