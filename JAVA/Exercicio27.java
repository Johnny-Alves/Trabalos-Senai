package pacote;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		a = input.nextInt();
		
		if (a>0) 
		
		{
			System.out.println("� positivo:  " + a);
			
		}
		// Dois simbolos de (==) � para compara��o		
		else if (a == 0) {
			
			System.out.println("� igual a zero:  " + a);
			
		}
		
		
		else {
		
			System.out.println("� negativo:  " + a);
	}

		input.close();
		
	}
		
}
