package pacote;

import java.util.Scanner;

public class Exercicio90 {

	public static void main(String[] args) {
		
		int[] valor = new int[5];
		int x, quant = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < valor.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			valor[i] = entrada.nextInt();
		}
		
		System.out.println("---------------------");
		System.out.print("Buscar por valor: ");
		x = entrada.nextInt();
		System.out.println("---------------------");
		
		for (int i = 0; i < valor.length; i++) {
			if( valor[i] == x) {
				quant++;
			}
		}
		
		System.out.println("Quantidade de vezes que aparece no vetor: " + quant);
		
		entrada.close();

	}

}
