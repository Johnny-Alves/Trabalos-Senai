package pacote;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
	
		
		double custo_fab, porc_dist, imposto, custo_final;

		imposto = 0.45;
		porc_dist = 0.28;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o custo de fabricação: ");
		custo_fab = input.nextDouble();

		custo_final = custo_fab + imposto * custo_fab + porc_dist * custo_fab;

		System.out.printf("Custo final é: R$ %.2f ", custo_final);

		input.close();

	}

}
