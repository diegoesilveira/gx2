package aula7.projetos.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import aula7.projetos.service.Autenticacao;

public class Login {

	public static void loginUsuario() {
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Login: ");
			String login = scanner.next();
			System.out.println("Senha: ");
			String senha = scanner.next();
			
			Autenticacao autentica = new Autenticacao();
			autentica.loginUsuario(login, senha);
			
		}catch(InputMismatchException e) {
			System.out.println("Erro digite o login e senha corretamente." + e);
			
		}
		
	}
}
