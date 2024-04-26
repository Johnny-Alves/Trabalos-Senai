package pacote;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
	
     Scanner input = new Scanner(System.in);
	 String numero_conta;
	 double saldo,cred,deb,saldo_atual;
	 
	 System.out.println("Digite o número da conta: ");
	 numero_conta = input.nextLine();
	 
	 System.out.println("Digite seu saldo: ");
	 saldo = input.nextDouble();
	 
	 System.out.println("Digite o seu crédito: ");
	 cred = input.nextDouble();
	 
	 System.out.println("Digite seu débito: ");
	 deb = input.nextDouble();
	 
	 saldo_atual = (saldo - deb + cred);
	 
	 if (saldo_atual>=0) {
		 
		 System.out.printf("Saldo Positivo:  R$ %.2f " , saldo_atual);
	 }
	 
	 else {
		 
		 System.out.printf("Saldo Negativo:  R$ %.2f " , saldo_atual);
		 
	 }
	 
	 
	 input.close();
	 
	 
	}

}
