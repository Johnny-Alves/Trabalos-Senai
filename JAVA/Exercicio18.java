package pacote;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		int ano_atual, ano_nasc, idade;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o ano atual: ");
		ano_atual = input.nextInt();

		System.out.println("Digite su ano de nascimento: ");
		ano_nasc = input.nextInt();

		idade = ano_atual - ano_nasc;

		if (idade >= 18) {

			System.out.println("Você pode votar esse ano!");

		}

		else {

			System.out.println("Você não pode votar esse ano");
		}

		input.close();
	}
}


