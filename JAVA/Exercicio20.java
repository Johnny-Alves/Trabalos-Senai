package pacote;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = input.nextInt();
		
		System.out.println("Digite o Segundo Valor: ");
		b = input.nextInt();
		
		if (a>b) {
			
			System.out.println("Ordem crescente: " + b + "," + a );
		}
		
		else {
			
			System.out.println("Ordem cescente: " + a + "," + b);
		}
		
		input.close();
		

	}

}
