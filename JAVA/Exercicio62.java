package pacote;

import java.util.Scanner;

public class Exercicio62 {

	public static void main(String[] args) {
		
		int quant_alunos;
		double notas, soma_notas = 0, media_aritmetica;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		quant_alunos = entrada.nextInt();
		
		System.out.println("------------------------------------");
		
		for(int i = 1; i <= quant_alunos; i++) {
			System.out.print("Informe a nota do " + i + "° aluno: ");
			notas = entrada.nextDouble();
			soma_notas += notas;
		}
		
		media_aritmetica = soma_notas / quant_alunos;
		
		System.out.println("------------------------------------");
		System.out.println("A média da turma é: " + media_aritmetica);

		entrada.close();
	}

}
