package pacote;

import java.util.Scanner;

public class Exercicio54 {

	public static void main(String[] args) {
		
		int n;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Informe o valor de n: ");
			n = entrada.nextInt();
			if(n <= 0) {
				System.out.println("Valor inválido!");
			}
			
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("Fim do programa!");
		
		entrada.close();

	}

}
