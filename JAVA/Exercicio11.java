package pacote;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		double sal_fixo,comi_fixa,sal_final;
		double carros_vendidos,venda_total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio fixo: ");
		sal_fixo = input.nextDouble();
		
		System.out.println("Informe a comiss�o fixa: ");
		comi_fixa = input.nextDouble();
		
		System.out.println("Informe o n�mero de carros vendidos: ");
		carros_vendidos = input.nextDouble();
		
		System.out.println("Informe o valor total de suas vendas: ");
		venda_total = input.nextDouble();
		
		sal_final = sal_fixo + carros_vendidos * comi_fixa + venda_total * 0.05;
		
		System.out.printf("Seu sal�rio final � de: R$ %.2f" , sal_final);
		
		input.close();
	}

}
