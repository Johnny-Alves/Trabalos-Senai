package pacote;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {

		String codigo_empregado;
		int ano_nascimento,ano_ingresso,idade,tempo_trabalho;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite número do empregado: ");
		codigo_empregado = input.nextLine();
		
		System.out.println("Digite seu ano de nascimento: ");
		ano_nascimento = input.nextInt();
		
		System.out.println("Digite o ano de ingresso na Empresa: ");
		ano_ingresso = input.nextInt();
		
		
		idade = 2022 - ano_nascimento;
		tempo_trabalho = 2022 - ano_ingresso;
		
		System.out.printf("________%s_____________\n" , codigo_empregado);
		System.out.printf("Idade:  %d anos\nTempo de trabalho: %d anos",idade,tempo_trabalho);
		
		if (idade>=65 || tempo_trabalho>=30 || (idade>=60 && tempo_trabalho>=25)   ) {
			
		System.out.println("\nRequerer Aposentadoria");	
			
		}
		
		else {
			
			System.out.println("\nNão requere!!!!!");
		}
		
		
		input.close();
		
		
		
	}

}
