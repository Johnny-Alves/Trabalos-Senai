package pacote;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		
		// classe
		Scanner input = new Scanner(System.in);
		// inteiro
		int a, b, c, idade;
		// Escrever na tela
		System.out.print("Quantos anos voc� tem? ");
		// Ler o Valor da Vari�vel
		a = input.nextInt();

		// Escrever na tela
		System.out.print("Quantos meses voc� tem?");
		// lER
		b = input.nextInt();

		// Escrever
		System.out.print("Quantos dias voce tem?");
		// Ler
		c = input.nextInt();

		idade = (a * 365) + (b * 30) + c;

		// Exibir
		System.out.println("Sua idade em dia � " + idade);
		
		input.close();
	}

}
