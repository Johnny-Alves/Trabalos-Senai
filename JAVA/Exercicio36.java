package pacote;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {

		int idade_homem_1, idade_homem_2;
		int idade_mulher_1, idade_mulher_2;
		int soma = 0, mult = 1;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Idade homem 1: ");
		idade_homem_1 = entrada.nextInt();
		
		System.out.print("Idade homem 2: ");
		idade_homem_2 = entrada.nextInt();
		
		System.out.print("Idade mulher 1: ");
		idade_mulher_1 = entrada.nextInt();
		
		System.out.print("Idade mulher 2: ");
		idade_mulher_2 = entrada.nextInt();
		
		if(idade_homem_1 > idade_homem_2) {
			soma += idade_homem_1;
			mult *= idade_homem_2;	
		}
		else {
			mult *= idade_homem_2;
			soma += idade_homem_1;	
		}
		
		if(idade_mulher_1 < idade_mulher_2) {
			soma += idade_mulher_1;
			mult *= idade_mulher_2;
		}
		else {
			soma += idade_mulher_1;
			mult *= idade_mulher_2;
		}
		
		System.out.println(soma);
		System.out.println(mult);
		
		entrada.close();
		
	}

}
