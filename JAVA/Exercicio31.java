package pacote;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		a = input.nextInt();

		System.out.println("Digite um n�mero: ");
		b = input.nextInt();

		System.out.println("Digite um n�mero: ");
		c = input.nextInt();

		if ((b - c < a && a < b + c)
				&& (a - c < b && b < a + c )
				&& (a - b < c && c < a + b)) {

			System.out.println("� um tri�ngulo");

		}
		
		
		else {
			
			System.out.println("N�o � um tri�ngulo");
			
		}
		
		input.close();

	}

}
