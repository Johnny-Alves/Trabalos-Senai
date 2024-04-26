package pacote;

import java.util.Scanner;

public class Exercicio59 {

	public static void main(String[] args) {
		
		int valor, quant_negativo = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe um valor: ");
			valor = entrada.nextInt();
			
			if(valor < 0) {
				quant_negativo++;
			}
			
		}
		
		System.out.println("Valores negativos: " + quant_negativo + " números.");

		entrada.close();
	}

}
