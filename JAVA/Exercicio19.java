package pacote;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		a = input.nextInt();
		
		System.out.println("Digite o segundo valor");
		b = input.nextInt();
		
		if (a>b) {
			
			System.out.println("O maior numero é: " + a);
		}
		
		
		else {
			
			System.out.println("O maior numero é:  " + b);
			
		}
		
		input.close();

	}



}
