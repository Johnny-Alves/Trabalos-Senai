package pacote;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		double n1, n2, n3, media_final;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		n1 = input.nextDouble();

		System.out.println("Digite a segunda nota: ");
		n2 = input.nextDouble();

		System.out.println("Digite a terceira nota: ");
		n3 = input.nextDouble();

		media_final = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

		System.out.printf("A média final é de %.2f pts", media_final);
		input.close();
	}

}
