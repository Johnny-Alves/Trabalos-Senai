package pacote;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		String time1, time2;
		int gol_t1, gol_t2;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome do primeiro time:  ");
		time1 = input.nextLine();

		System.out.println("Digite o nome do segundo time:  ");
		time2 = input.nextLine();

		System.out.printf("Quantos gols o %s fez:\n", time1);
		gol_t1 = input.nextInt();

		System.out.printf("Quantos gols o %s fez:\n", time2);
		gol_t2 = input.nextInt();

		if (gol_t1 > gol_t2) {

			System.out.printf(" O %s Ganhou!!!", time1);

		}

		else if (gol_t2 > gol_t1) {

			System.out.printf("O %s Ganhou!!!", time2);
		}

		else {

			System.out.println("Deu empate!!!!!");
		}
		
		input.close();

	}

}
