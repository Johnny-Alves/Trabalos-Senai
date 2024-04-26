package pacote;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		double sal_fixo, valor_vendas, sal_total;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite seu Salário: ");
		sal_fixo = input.nextDouble();
		System.out.println("Digite o valor das vendas: ");
		valor_vendas = input.nextDouble();

		if (valor_vendas > 1500) {

			sal_total = 1500 * 0.03 + (valor_vendas - 1500) * 0.05 + sal_fixo;

			System.out.printf("Seu salário total é: R$ %.2f", sal_total);

		}

		else {
			sal_total = valor_vendas * 0.03 + sal_fixo;

			System.out.printf("Seu salário total é: R$ %.2f", sal_total);

		}

		input.close();
		
	}

}
