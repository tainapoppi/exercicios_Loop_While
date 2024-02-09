package exerciciosLoop;

import java.util.Scanner;

public class Exerc_3 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        int idade;
	        int totalMenoresDe21 = 0;
	        int totalMaioresDe50 = 0;

	        System.out.println("Digite as idades das pessoas. Digite uma idade negativa para encerrar.");

	        System.out.print("Digite uma idade: ");
	        idade = leia.nextInt();

	        while (idade >= 0) {
	            if (idade < 21) {
	                totalMenoresDe21++;
	            } else if (idade > 50) {
	                totalMaioresDe50++;
	            }

	            System.out.print("Digite uma idade: ");
	            idade = leia.nextInt();
	        }

	        System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenoresDe21);
	        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaioresDe50);

	}

}
