package pacote;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		double salario,reajuste,novo_sal;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite seu salário atual: ");
			
			salario = input.nextDouble();
			
			System.out.println("Digite o percentual de reajuste somente em numero: ");
			
			reajuste = input.nextDouble();
			
			novo_sal = salario*(1 + reajuste / 100);
			
			//Formatação fica mais facil com mais variaveis
			System.out.printf("Novo salario R$ %.2f" , novo_sal);
				
			input.close();
		}

		
		
	}

}
