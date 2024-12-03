package exercicios_03_12;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

        // variáveis
        String caracteristica1, caracteristica2, caracteristica3;

        Scanner leia = new Scanner(System.in);

        // Entrada
        System.out.println("Digite a primeira característica: ");
        caracteristica1 = leia.next();

        System.out.println("Digite a segunda característica: ");
        caracteristica2 = leia.next();

        System.out.println("Digite a terceira característica: ");
        caracteristica3 = leia.next();        

        // Processamento

        // Vertebrados
        if (caracteristica1.equals("Vertebrado")) {
            if (caracteristica2.equals("Ave") && caracteristica3.equals("Carnívoro")) {
                System.out.println("Águia");
            }
            else if (caracteristica2.equals("Ave") && caracteristica3.equals("Onívoro")) {
                System.out.println("Pomba");
            }
            else if (caracteristica2.equals("Mamífero") && caracteristica3.equals("Onívoro")) {
                System.out.println("Homem");
            }
            else if (caracteristica2.equals("Mamífero") && caracteristica3.equals("Herbívoro")) {
                System.out.println("Vaca");
            }
        }

        // Invertebrados
        else if (caracteristica1.equals("Invertebrado")) {
            if (caracteristica2.equals("Inseto") && caracteristica3.equals("Hematófago")) {
                System.out.println("Pulga");
            }
            else if (caracteristica2.equals("Inseto") && caracteristica3.equals("Herbívoro")) {
                System.out.println("Lagarta");
            }
            else if (caracteristica2.equals("Anelídeo") && caracteristica3.equals("Hematófago")) {
                System.out.println("Sanguessuga");
            }
            else if (caracteristica2.equals("Anelídeo") && caracteristica3.equals("Onívoro")) {
                System.out.println("Minhoca");
            }
        }

        leia.close();

	}

}
