package pacote;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {

		String login, senha;

		Scanner input = new Scanner(System.in);

		System.out.print("Login: ");
		login = input.nextLine();

		if (login.equals("1234")) {

			System.out.print("Senha: ");
			senha = input.nextLine();

			if (senha.equals("9999")) {

				System.out.println("Acesso permitido");
			}

			else {

				System.out.println("Senha incorreta!!!!");
			}

		}

		else {

			System.out.println("Usuário inválido");
		}

		input.close();
	}

}
