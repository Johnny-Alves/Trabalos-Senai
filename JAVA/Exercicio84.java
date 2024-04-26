package pacote;

import java.util.Scanner;

public class Exercicio84 {

	public static void main(String[] args) {
		
		int[] A;
		int[] B;
		int[] soma;
		int N;

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor de N: ");
		N = entrada.nextInt();
		System.out.println("----------------------------");
		
		A = new int[N];
		B = new int[N];
		soma = new int[N];
		
		for (int i = 0; i < A.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor do vetor A: ");
			A[i] = entrada.nextInt();
		}
		System.out.println("--------------------------------------");
		for (int i = 0; i < A.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor do vetor B: ");
			B[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < soma.length; i++) {
			soma[i] = A[i] + B[i];
		}
		
		System.out.println("---------- Vetor soma -----------");
		for (int i = 0; i < soma.length; i++) {
			System.out.print(soma[i] + " ");
		}
		
		entrada.close();

	}

}
