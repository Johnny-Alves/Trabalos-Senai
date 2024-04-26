package pacote;

public class Exercicio76 {

	public static void main(String[] args) {
		
		for (int linha = 1; linha <= 10; linha++) {
			for (int coluna = 1; coluna <= 60; coluna++) {
				if(linha == 1 || linha == 10) {
					System.out.print("+");	
				}
				else {
					if(coluna == 1 || coluna == 60) {
						System.out.print("+");	
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}

	}

}
