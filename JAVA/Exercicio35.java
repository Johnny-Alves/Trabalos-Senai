package pacote;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		
		char opcao;
		double qunt_combustivel, valor_total;
		double preco_Al, preco_Gas;
		
		preco_Al = 1;
		preco_Gas = 10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("------------MENU------------");
		System.out.println("Selecione uma opção:(A/G)");
		System.out.println("A-álcool");
		System.out.println("G-gasolina");
		System.out.print("Opção: ");
		opcao = input.next().charAt(0);
		System.out.println("----------------------------");
		
		System.out.print("Litros de combustível vendido: ");
		qunt_combustivel = input.nextDouble();
		System.out.println("----------------------------");
		
		if(opcao == 'A' || opcao == 'a') {
			if(qunt_combustivel <= 20) {
				valor_total = preco_Al * 0.97 * qunt_combustivel;
			}
			else {
				valor_total = preco_Al * 0.95 * qunt_combustivel;
			}
		}
		else {
			if(qunt_combustivel <= 20) {
				valor_total = preco_Gas * 0.96 * qunt_combustivel;
			}
			else {
				valor_total = preco_Gas * 0.94 * qunt_combustivel;
			}
		}
		
		System.out.printf("Valor total: R$%.2f", valor_total);
		
		input.close();
		
	}

}
