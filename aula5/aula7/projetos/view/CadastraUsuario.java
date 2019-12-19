package aula7.projetos.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import aula7.projetos.model.TipoUsuario;
import aula7.projetos.model.Usuario;
import aula7.projetos.service.Autenticacao;

public class CadastraUsuario {
	
	public static void coletaDadosUsuario() {
				
		int codigoUsuario = 01;
		String nomeUsuario = "Diego Silveira";
		String usuarioLogin ="diegoesilveira";
		String email = "diegoesilveira@gmail.com";
		String senha = "absaASDF";
		
		TipoUsuario tipoUsuario = TipoUsuario.valueOf("ADMINISTRADOR");
							
		Usuario usuario = new Usuario(codigoUsuario, nomeUsuario, usuarioLogin, email, senha, tipoUsuario);
		
		Autenticacao autentica = new Autenticacao();
		
		autentica.autenticaUsuario(usuario);
		
		 
	}

}
