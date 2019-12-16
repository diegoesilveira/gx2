package aula5.projetos.teste;

import aula5.projetos.planos.telefonia.PlanoPreTelefonia;

public class TestePlanoPreTelefonia {
	
	public static void main(String[] args) {
		
		PlanoPreTelefonia planoPreTelefonia = new PlanoPreTelefonia(02, "Plano Pre Telefonia", 59.99, 500, 300);
		
		System.out.println("Codigo plano Pre Telefonia: " + planoPreTelefonia.getCodPlano());
		System.out.println("Descrição Plano Pre Telefonia: " + planoPreTelefonia.getDescricaoPlano());
		System.out.println("Valor Plano Pre Telefonia: " + planoPreTelefonia.getValorPlano());
		System.out.println("Franquia Plano Pre Telefonia: " + planoPreTelefonia.getFranquiaMinutos());
		System.out.println("Bonus Plano Pre Telefonia: " + planoPreTelefonia.getBonus());
	}

}
