package pacote;

import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		int a, b = 0, resultado;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		a = input.nextInt();

		while (b == 0) {

			System.out.println("Digite o segundo valor: ");
			b = input.nextInt();
			
			if (b==0) {
				
				System.out.println("VALOR INVÁLIDO!!!!!!");
				
			}

		}

		resultado = a / b;

		System.out.printf("O resultado é: %d", resultado);

		input.close();

	}

}
