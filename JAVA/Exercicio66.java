package pacote;

import java.util.Scanner;

public class Exercicio66 {

	public static void main(String[] args) {

		int valor1, valor2, soma = 0;
	
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o 1° valor: ");
		valor1 = entrada.nextInt();

		System.out.print("Informe o 2° valor: ");
		valor2 = entrada.nextInt();

		if(valor1 > valor2) {
			for (int i = valor2; i <= valor1; i++) {
				soma += i;
			}	
		} else {
			for (int i = valor1; i <= valor2; i++) {
				soma += i;
			}	
		}
		
		System.out.println("-----------------");
		System.out.println("A soma é: " + soma);

		entrada.close();

	}

}
