package pacote;

import java.util.Scanner;

public class Exercicio85 {

	public static void main(String[] args) {
		
		int dias = 5, num_dias_acima_da_media = 0;
		double[] temp = new double[dias];
		double soma = 0, menor_temp = Double.MAX_VALUE
				, maior_temp = Double.MIN_VALUE
				, media;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print("Informe a " + (i + 1) + "° temperatura: ");
			temp[i] = entrada.nextDouble();
			soma += temp[i];
			if(temp[i] > maior_temp) {
				maior_temp = temp[i];
			}
			
			if(temp[i] < menor_temp) {
				menor_temp = temp[i];
			}
		}
		
		media = soma / dias;
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] > media) {
				num_dias_acima_da_media++;
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("Menor temperatura do ano: " + menor_temp + "°.");
		System.out.println("Maior temperatura do ano: " + maior_temp + "°.");
		System.out.printf("Temperatura média do ano: %.2f°", media);
		System.out.println("\nNúmeros de dias acima da média: " + num_dias_acima_da_media);
		System.out.println("------------------------------------");
		

		entrada.close();

	}

}
