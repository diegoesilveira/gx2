package aula7.projetos.view;

import aula7.projetos.model.TipoUsuario;
import aula7.projetos.model.Usuario;
import aula7.projetos.service.Autenticacao;

public class CadastraUsuario {
	
	public static void coletaDadosUsuario() {
		
		int codigoUsuario = 01;
		String nomeUsuario = "diego silveira";
		String usuarioLogin = "diegoesilveira";
		String email = "diegoesilveira@gmail.com";
		String senha = "abWrUkL1020";
		TipoUsuario tipoUsuario = TipoUsuario.valueOf("SUPERVISOR");
		
		Usuario usuario = new Usuario(codigoUsuario, nomeUsuario, usuarioLogin, email, senha, tipoUsuario);
		
		Autenticacao autentica = new Autenticacao();
		autentica.autenticaUsuario(usuario);
	}

}
