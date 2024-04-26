package pacote;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		
		
		double tot_elei, branco, nulo, valido;

		double perc_branco, perc_nulo, perc_valido;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o numero total de eleitores: ");

		tot_elei = input.nextDouble();

		System.out.println("Digite o numero de votos brancos: ");

		branco = input.nextDouble();

		System.out.println("Digite o numero de votos nulos: ");

		nulo = input.nextDouble();

		System.out.println("Digite o numero de votos validos: ");

		valido = input.nextDouble();

		perc_branco = 100 * branco / tot_elei;
		perc_nulo = 100 * nulo / tot_elei;
		perc_valido = 100 * valido / tot_elei;

		System.out.println("Percentual voto branco: " + perc_branco + "%");
		System.out.println("Percentual voto branco: " + perc_nulo + "%");
		System.out.println("Percentual vo branco: " + perc_valido + "%");

//		System.out.printf("Percentual voto branco: %.2f " , perc_branco);
//		System.out.printf("\nPercentual voto branco: %.2f ", perc_nulo);
//		Estuda pra vc ficar baum

		// Fechar o Scanner
		input.close();
	}

}
