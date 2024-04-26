package pacote;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		double a;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a quantidade de maças compradas: ");
		a = input.nextDouble();

		if (a >=12) {

			System.out.printf("Custo total da compra é: R$ %.2f" , (a*1));
		}

		else {

			System.out.printf("Custo total da compra é: R$ %.2f" , (a*1.3));
		}
		
		input.close();

	}

}
