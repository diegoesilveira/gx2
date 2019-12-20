package aula7.projetos.app;

import aula7.projetos.view.CadastraUsuario;
import aula7.projetos.view.Login;

public class Main {
	
	public static void main(String[] args) {
		
		CadastraUsuario usuario = new CadastraUsuario();
		usuario.coletaDadosUsuario();
	}

}
