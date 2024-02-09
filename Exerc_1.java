package exerciciosLoop;

import java.util.Scanner;

public class Exerc_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int primeiroNumero = leia.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int ultimoNumero = leia.nextInt();

       
        if (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo inválido!");
            return; // Sai do programa se o intervalo for inválido
        }

        System.out.println("\nNo Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":\n");

     
        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }

	}

}
