package pacote;

import java.util.Scanner;

public class Exercicio83 {

	public static void main(String[] args) {
		
		int[] valor = new int[5];

		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < valor.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			valor[i] = entrada.nextInt();
		}
		
		System.out.println("-------- Vetor Invertido -------");
		for (int i = valor.length - 1; i >= 0; i--) {
			System.out.print(valor[i] + " ");
		}
		
		entrada.close();

	}

}
