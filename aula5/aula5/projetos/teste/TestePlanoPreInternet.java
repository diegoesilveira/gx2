package aula5.projetos.teste;

import aula5.projetos.planos.Plano;
import aula5.projetos.planos.internet.PlanoPreInternet;
import aula5.projetos.planos.telefonia.PlanoPreTelefonia;

public class TestePlanoPreInternet {
	
	public static void main(String[] args) {
		
		PlanoPreInternet planoPreInternet = new PlanoPreInternet(03, "Plano Pre Internet ",49.99, 100, 300);
		
		System.out.println("Codigo plano Pre Internet: " + planoPreInternet.getCodPlano());
		System.out.println("Descrição plano Pre Internet: " + planoPreInternet.getDescricaoPlano());
		System.out.println("Valor plano Pre Internet: " + planoPreInternet.getValorPlano());
		System.out.println("Velocidade plano Pre Internet: " + planoPreInternet.getVelocidade());
		System.out.println("Franquia plano Pre Internet: " + planoPreInternet.getFranquiaDeDados());
		
	}

}
