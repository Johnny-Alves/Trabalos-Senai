package pacote;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite um número: ");
		a = input.nextInt();
		
		System.out.println("Digite um número: ");
		b = input.nextInt();
		
		
		System.out.println("Digite um número: ");
		c = input.nextInt();
		
		
		if (a > b && a > c) {

			if (b > c) {

				System.out.printf("Ordem crescente: %d | %d | %d   " , c , b , a);
			}

			else {

				System.out.printf("Ordem crescente: %d | %d | %d   " , b , c , a);
			}

		}

		else if (b > c && b > a) {

			if (c > a) {

				System.out.printf("Ordem crescente: %d | %d | %d   " , a , c , b);
			}

			else {

				System.out.printf("Ordem crescente: %d | %d | %d   " , c, a , b);
			}

		}

		else {

			if (b > a) {

				System.out.printf("Ordem crescente: %d | %d | %d   " ,a , b , c);
			}

			else {

				System.out.printf("Ordem crescente: %d | %d | %d   " , b, a , c);
			}
		}
		
		input.close();	}

}
