package pacote;

import java.util.Scanner;

public class Exercicio82 {

	public static void main(String[] args) {
		
		int[] valor = new int[10];
		int[] M = new int[10];
		int mult;

		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < valor.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			valor[i] = entrada.nextInt();
		}
		
		System.out.println("----------------------------------");
		System.out.print("Informe o multiplicador: ");
		mult = entrada.nextInt();
		System.out.println("----------------------------------");
		
		for (int i = 0; i < M.length; i++) {
			M[i] = valor[i] * mult;
		}
		
		System.out.println("------------- Vetor M ------------");
		
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + " ");
		}
		
		entrada.close();

	}

}
