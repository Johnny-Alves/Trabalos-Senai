package pacote;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		
		double B,A,total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a base do retangulo: ");
		
		B = input.nextDouble();
		
		System.out.println("Digite a altura do retangulo: ");
		
		A = input.nextDouble();
		
				
		total = B*A;
		
		System.out.println("Essa é a área do retangulo: " + total);
		
		input.close();

	}

}
