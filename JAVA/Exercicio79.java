package pacote;

import java.util.Scanner;

public class Exercicio79 {

	public static void main(String[] args) {
		
		Double[] nota = new Double[5];
		double soma = 0, media;
		int quant = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < nota.length; i++) {
			System.out.print("Digite a " + (i + 1) + "° nota: ");
			nota[i] = entrada.nextDouble();
			soma += nota[i];
		}
		
		media = soma / nota.length;
		
		for (int i = 0; i < nota.length; i++) {
			if(nota[i] > media) {
				quant++;
			}
		}
		
		System.out.println("----------------------------------");
		System.out.println("Media da turma: " + media);
		System.out.println("Alunos que acima da media: " + quant);
		System.out.println("----------------------------------");
		
		entrada.close();
		
	}

}
