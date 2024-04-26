package pacote;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		
		double n1, n2, n3, media_exercicio, media_aproveitamento;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a Nota 1: ");
		n1 =input.nextDouble();
		
		System.out.println("Digite a Nota 2: ");
		n2 =input.nextDouble();
		
		System.out.println("Digite a Nota 3: ");
		n3 =input.nextDouble();
		
		System.out.println("Digite a Média de exercício: ");
		media_exercicio =input.nextDouble();
		
		media_aproveitamento = (n1+n2*2+n3*3+media_exercicio)/7;
		
		
		if ( media_aproveitamento >=9) {
			
			System.out.println("Conceito A!!!!");
			
		}
		
		else if (media_aproveitamento>=7.5 && media_aproveitamento<9) {
			
			System.out.println("Conceito B!!!!");
		}
		
		else if (media_aproveitamento>=6 && media_aproveitamento<7.5) {
			
			System.out.println("Conceito C!!!!");
		}
		
		else {
			
			System.out.println("Conceito D!!!!");
		}
		
		input.close();
	}

}
