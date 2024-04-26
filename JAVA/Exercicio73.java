package pacote;

import java.util.Scanner;

public class Exercicio73 {

	public static void main(String[] args) {
		
		int n_filhos, total_filhos = 0, media_filhos, quant_sal_150 = 0, quant_entravistados = 0;
		double salario = 0, total_salario = 0, media_salario
				, maior_salario = Integer.MIN_VALUE
				, percentual;

		Scanner entrada = new Scanner(System.in);
		
		while (salario >= 0) {
			System.out.print("Informe o número de filhos: ");
			n_filhos = entrada.nextInt();
			
			System.out.print("Informe o salário: ");
			salario = entrada.nextDouble();
			
			System.out.println("-------------------------------");
			
			total_salario += salario;
			total_filhos += n_filhos;
			
			if(salario > maior_salario) {
				maior_salario = salario;
			}
			
			if(salario < 150) {
				quant_sal_150++;
			}
			
			quant_entravistados++;
			
		}
		
		media_filhos = total_filhos / quant_entravistados;
		media_salario = total_salario / quant_entravistados;
		percentual = quant_sal_150 / quant_entravistados;
		
		System.out.println("------------------------------------------------------------");
		System.out.printf("Média de salário: R$%.2f", media_salario);
		System.out.printf("\nMédia de filhos: %d", media_filhos);
		System.out.printf("\nMaior salário: R$%.2f", maior_salario);
		System.out.printf("\nPercentual com salário menor que R$ 150,00: %.0f", percentual);
		System.out.println("\n------------------------------------------------------------");
	
		entrada.close();
	
	}

}
