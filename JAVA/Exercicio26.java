package pacote;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		int quant_atual, quant_max, quant_min;
		double quant_media;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a quantidade atual: ");
		quant_atual = input.nextInt();

		System.out.println("Digite a quantidade máxima: ");
		quant_max = input.nextInt();

		System.out.println("Digite a quantidade minima: ");
		quant_min = input.nextInt();

		quant_media = (quant_max + quant_min) / 2;

		if (quant_atual >= quant_media) {

			System.out.println("Não efetuar compra");
		}

		else {
			System.out.println("Efetuar compra");
		}
		input.close();
	}

}
