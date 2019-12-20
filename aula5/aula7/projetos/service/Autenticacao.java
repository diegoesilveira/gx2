package aula7.projetos.service;

import aula7.projetos.model.Usuario;
import aula7.projetos.view.Login;

public class Autenticacao {
	
		PermissaoService permissaoService = new PermissaoService();
				
		public void autenticaUsuario(Usuario usuario, String loginUser, String senhaUser)  {
			
			if(usuario.getUsuario().equals(loginUser) | usuario.getEmail().equals(loginUser)) {
				
				if(usuario.getSenha().equals(senhaUser)) {
					
					System.out.println("Usuario autenticado.");
					System.out.println("Tipo de usuario: " + usuario.getTipoUsuario().getDescricao());
					
					permissaoService.validaPermissao(usuario);
				} 
				else {
					System.out.println("Erro senha não confere.");
				}
			} 
			else {
				System.out.println("Erro usuario ou email não confere.");
			}
		}

		
		
}
