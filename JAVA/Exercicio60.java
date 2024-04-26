package pacote;

import java.util.Scanner;

public class Exercicio60 {

	public static void main(String[] args) {

		int valor, quant_10_20 = 0, quant_fora = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe um valor: ");
			valor = entrada.nextInt();

			if (valor >= 10 && valor <= 20) {
				quant_10_20++;
			}
			else {
				quant_fora++;
			}

		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Valores entre 10 e 20: " + quant_10_20 + " números.");
		System.out.println("Valores fora do intervalo: " + quant_fora + " números.");
		
		entrada.close();

	}

}
