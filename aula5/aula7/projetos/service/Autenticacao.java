package aula7.projetos.service;

import aula7.projetos.model.Usuario;

public class Autenticacao {
		
		String usuarioSistema = "diegoesilveira";
		String senhaSistema = "abWrUkL1020";
		
		public void autenticaUsuario(Usuario usuario)  {
			
			if(usuario.getUsuario().equals(usuarioSistema) | usuario.getEmail().equals(usuarioSistema)) {
				
				if(usuario.getSenha().equals(senhaSistema)) {
					
					System.out.println("Usuario autenticado.");
					System.out.println("Tipo de usuario: " + usuario.getTipoUsuario().getDescricao());
					PermissaoService.validaPermissao(usuario);
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
