package aula7.projetos.view;

import aula7.projetos.model.user.TipoUsuario;
import aula7.projetos.model.user.Usuario;

public class SolicitaDadosUsuario {
	
	public static void coletaDadosUsuario() {
		
		int codigoUsuario = 01;
		String nomeUsuario = "diego silveira";
		String usuarioLogin = "diegoesilveira";
		String email = "diegoesilveira@gmail.com";
		String senha = "abWrUkL1020";
		TipoUsuario tipoUsuario = TipoUsuario.valueOf("ADMINISTRADOR");
		
		Usuario usuario = new Usuario(codigoUsuario, nomeUsuario, usuarioLogin, email, senha, tipoUsuario);
	}

}
