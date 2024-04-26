package pacote;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		
		double valor_hora,horas_trab,valor_horaextra,salario;
	

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite quanto você recebe por hora: ");
		valor_hora = input.nextDouble();
		
		System.out.println("Digite quantas horas você trabalhou: ");
		horas_trab = input.nextDouble();
		
		valor_horaextra = 1.5 * valor_hora;
		
		
		
		if (horas_trab > 40) {
			
			
			salario = valor_hora * 40 + valor_horaextra * (horas_trab - 40);
			
			System.out.printf("Seu salário é: R$ %.2f" , salario);
			
		}
		
		else {
			
			salario = valor_hora * horas_trab;
			System.out.printf("Seu salário é: R$ %.2f" , salario);
			
		}
		
		input.close();
		
		
	}

}
