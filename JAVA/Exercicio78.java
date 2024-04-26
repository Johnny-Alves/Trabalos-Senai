package pacote;

import java.util.Scanner;

public class Exercicio78 {

	public static void main(String[] args) {
		
		String[] nome = new String[3];
		String nome_busca;
		int encontrados = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < nome.length; i++) {
			System.out.print("Digite o " + (i + 1) + "° nome: ");
			nome[i] = entrada.nextLine();
		}
		
		System.out.println("-------------------------");
		System.out.print("Busque um nome: ");
		nome_busca = entrada.nextLine();
		System.out.println("-------------------------");
		
		for (int i = 0; i < nome.length; i++) {
			if(nome_busca.equalsIgnoreCase(nome[i])) {
				encontrados++;
			}
			
		}
		
		if(encontrados > 0) {
			System.out.println("ACHEI");
		}
		else {
			System.out.println("NÃO ACHEI");
		}
		
		entrada.close();

	}

}
