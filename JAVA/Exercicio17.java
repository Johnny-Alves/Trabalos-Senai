package pacote;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		double n1, n2, media;

		Scanner input = new Scanner(System.in);

		System.out.println("Digiti a primeira nota: ");
		n1 = input.nextDouble();

		System.out.println("Digite a segunda nota: ");
		n2 = input.nextDouble();

		media = (n1 + n2) / 2;

		if (media >= 6) {

			System.out.printf("Aluno APROVADO!! Nota média: %.2f ", media);

		}

		else {

			System.out.printf("Aluno REPROVADO!! Nota média: %.2f", media);
		}

		input.close();

	}

}
