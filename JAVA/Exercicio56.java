package pacote;

import java.util.Scanner;

public class Exercicio56 {

	public static void main(String[] args) {

		int n;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Informe o valor de N: ");
			n = entrada.nextInt();
			if (n < 1 || n > 10) {
				System.out.println("Valor inválido!");
			}
			
		} while (n < 0 || n > 10);
		
		System.out.println("---------------");
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println(n + " x " + i + " = " + (n * i));
			
		}
		
		entrada.close();

	}

}
