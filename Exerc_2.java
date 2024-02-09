package exerciciosLoop;

import java.util.Scanner;

public class Exerc_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        System.out.println("\nTotal de números pares: " + totalPares);
        System.out.println("Total de números ímpares: " + totalImpares);

	}

}
