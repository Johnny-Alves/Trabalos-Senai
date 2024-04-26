package pacote;

import java.util.Scanner;

public class Exercicio64 {

	public static void main(String[] args) {

		int valor, soma = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe o " + i + "° valor: ");
			valor = entrada.nextInt();
			
			if (valor < 40) {
				soma += valor;
			}
		}

		System.out.println("---------------------------------------------");
		System.out.println("A soma dos valores inferioes a 40 é: " + soma);

		entrada.close();

	}

}
