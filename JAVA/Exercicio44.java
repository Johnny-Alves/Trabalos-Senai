package pacote;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,resultado;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Valor: ");
		a = input.nextInt();
		
		
		
		
		
		do {
			
			System.out.println("Digite o segundo Valor: ");
			b = input.nextInt();
		}
		 while (b==0);
		
		resultado = a/b;
		
		System.out.printf("O resultado é: %d" ,resultado);
		
		
	} 

}
