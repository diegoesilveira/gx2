package aula7.projetos.service;

import aula7.projetos.model.Usuario;

public class PermissaoService {

	public void validaPermissao(Usuario usuarioAutenticado) {

		if (usuarioAutenticado.getTipoUsuario().getDescricao().equals("Administrador")) {
			System.out.println("\n-------------Perfil Administrador------------------\n");
			System.out.println("1 - Criar usuario \n2- Remover usuario\n3 - Resetar senha");
		}
		else if(usuarioAutenticado.getTipoUsuario().getDescricao().equals("Supervisor")) {
			System.out.println("\n-------------Perfil Supervisor------------------\n");
			System.out.println("1 - Criar usuario");
		} 
		else if(usuarioAutenticado.getTipoUsuario().getDescricao().equals("Operador")) {
			System.out.println("\n-------------Perfil Operador------------------\n");
			System.out.println("Sem acesso!");
		} 
		else {
			
		}

	}

}
