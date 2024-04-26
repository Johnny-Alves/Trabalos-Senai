package pacote;

public class Exercicio67 {

	public static void main(String[] args) {
		
		int soma = 0;
		double media;
		
		for (int i = 15; i <= 100; i++) {
			soma += i;
		}
		
		media = soma / (100 - 15);
		
		System.out.println("----------------------------------------------------");
		System.out.println("A média da soma dos valores entre 15 e 100 é: " + media);
		
	}

}
