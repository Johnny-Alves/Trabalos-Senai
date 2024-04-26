package pacote;

import java.util.Scanner;

public class Exercicio61 {

	public static void main(String[] args) {
		
		int valor, soma = 0;
		double media_aritmetica;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe um valor: ");
			valor = entrada.nextInt();
			
			soma += valor;
		}
		
		media_aritmetica = soma / 10;
		
		System.out.println("----------------------");
		System.out.println("A média é: " + media_aritmetica);
		
		entrada.close();

	}

}
