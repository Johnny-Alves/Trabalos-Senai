package pacote;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		int a, b;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		a = input.nextInt();

		System.out.println("Digite o segundo valor: ");
		b = input.nextInt();

		if (a > b) {

			System.out.printf(" O maior n�mero �: %d", a);

		}

		else if (b > a) {

			System.out.printf( "O maior n�mero �:  %d" , b);
		}

		else {

			System.out.printf("Os n�meros s�o iguais: %d | %d " ,a ,b );
		}

		input.close();

	}

}
