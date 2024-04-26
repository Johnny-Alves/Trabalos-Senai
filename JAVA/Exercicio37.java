package pacote;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		
	double quant_morango,quant_maca;
	double preco_morango,preco_maca;
	double kg_total,preco_total;
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Digite a quantidade de Morango comprada em Kg");
	quant_morango = input.nextDouble();
	
	System.out.println("Digite a quantidade de Maça comprada em Kg");
	quant_maca = input.nextDouble();
	
	if(quant_morango > 5) {
		preco_morango = 2.2;
	}
	else {
		preco_morango = 2.5;
	}
	
	if(quant_maca > 5) {
		preco_maca = 1.5;
	}
	else {
		preco_maca = 1.8;
	}
	
	preco_total = quant_maca * preco_maca + quant_morango * preco_morango;
	kg_total = quant_maca + quant_morango;
	
	if(kg_total > 8 || preco_total > 25) {
		preco_total *= (1 - 0.1);
	}
	
	System.out.printf("Valor a ser pago: R$%.2f", preco_total);
	
	input.close();
	
	}

}
