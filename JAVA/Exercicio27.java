package pacote;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número");
		a = input.nextInt();
		
		if (a>0) 
		
		{
			System.out.println("é positivo:  " + a);
			
		}
		// Dois simbolos de (==) é para comparação		
		else if (a == 0) {
			
			System.out.println("é igual a zero:  " + a);
			
		}
		
		
		else {
		
			System.out.println("é negativo:  " + a);
	}

		input.close();
		
	}
		
}
