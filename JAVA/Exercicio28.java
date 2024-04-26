package pacote;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		int a, b, c;

		Scanner input = new Scanner(System.in);

		System.out.println("Digito o primeiro valor: ");
		a = input.nextInt();

		System.out.println("Digito o segundo valor: ");
		b = input.nextInt();

		System.out.println("Digito o terceiro valor: ");
		c = input.nextInt();

		if (a>b && a>c)

		{

			System.out.println("O maior número é: " + a);

		}

		else if (b>c && b>a)  {
			
			System.out.println("O maior número é: " + b);
			
		}
	
		else {
			
			System.out.println("O maior número é: " + c);
		}
		
		input.close();
			
		
	}

}
