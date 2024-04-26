package pacote;

import java.util.Scanner;

public class Exercicio70 {

	public static void main(String[] args) {

		int valor, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe o " + i + "° valor: ");
			valor = entrada.nextInt();
			
			if(valor > maior) {
				maior = valor;
			}
			
			if(valor < menor) {
				menor = valor;
			}
		}
		
		System.out.println("----------------------------");
		System.out.println("O maior valor é o " + maior);
		System.out.println("O menor valor é o " + menor);
		
		entrada.close();

	}

}
