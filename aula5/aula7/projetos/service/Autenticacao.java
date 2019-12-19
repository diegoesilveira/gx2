package aula7.projetos.service;

import aula7.projetos.model.Usuario;

public class Autenticacao {
		
		String usuarioSistema;
		String senhaSistema;
		
		PermissaoService permissaoService = new PermissaoService();
		
		public void loginUsuario(String usuarioSistema, String senhaSistema) {
			this.usuarioSistema = usuarioSistema;
			this.senhaSistema = senhaSistema;
			
		}
		
		public void autenticaUsuario(Usuario usuario)  {
			
			if(usuario.getUsuario().equals(this.usuarioSistema) | usuario.getEmail().equals(this.usuarioSistema)) {
				
				if(usuario.getSenha().equals(this.senhaSistema)) {
					
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
