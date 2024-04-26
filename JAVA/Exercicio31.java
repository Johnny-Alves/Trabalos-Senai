package pacote;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		a = input.nextInt();

		System.out.println("Digite um número: ");
		b = input.nextInt();

		System.out.println("Digite um número: ");
		c = input.nextInt();

		if ((b - c < a && a < b + c)
				&& (a - c < b && b < a + c )
				&& (a - b < c && c < a + b)) {

			System.out.println("É um triângulo");

		}
		
		
		else {
			
			System.out.println("Não é um triângulo");
			
		}
		
		input.close();

	}

}
