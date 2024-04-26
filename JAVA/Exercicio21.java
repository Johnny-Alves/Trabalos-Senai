package pacote;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		int hora_inicio,hora_fim,tempo_jogo;
		int dia = 24,tempo_jogo1;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite a hora de inicio do jogo: ");
		hora_inicio = input.nextInt();
		
		System.out.println("Digite a hora do fim de jogo: ");
		hora_fim = input.nextInt();
		
		tempo_jogo = (dia - hora_inicio) + hora_fim;
		tempo_jogo1 = hora_fim - hora_inicio;
		
		
		if (hora_fim < hora_inicio) {
			
			System.out.println("O tempo de jogo foi de: "  + tempo_jogo  +  " Horas");
			
		}
		
		else {
			
			System.out.println("O tempo de jogo foi de: " + tempo_jogo1 + " Horas");
		}
		
		
		
		
		
			
		
		input.close();
		
		
	}

}
