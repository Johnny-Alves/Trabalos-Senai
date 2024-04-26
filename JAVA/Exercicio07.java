package pacote;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		
		// classe
		Scanner input = new Scanner(System.in);
		// inteiro
		int a, b, c, idade;
		// Escrever na tela
		System.out.print("Quantos anos você tem? ");
		// Ler o Valor da Variável
		a = input.nextInt();

		// Escrever na tela
		System.out.print("Quantos meses você tem?");
		// lER
		b = input.nextInt();

		// Escrever
		System.out.print("Quantos dias voce tem?");
		// Ler
		c = input.nextInt();

		idade = (a * 365) + (b * 30) + c;

		// Exibir
		System.out.println("Sua idade em dia é " + idade);
		
		input.close();
	}

}
