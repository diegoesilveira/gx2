package aula5.projetos.teste;

import aula5.projetos.planos.telefonia.PlanoPosTelefonia;

public class TestePlanoPosTelefonia {

	public static void main(String[] args) {

		PlanoPosTelefonia planoPosTelefonia = new PlanoPosTelefonia(01, "Plano Pos Telefonia", 199.99, 150, 200);
		
		System.out.println("Codigo plano Pos Telefonia: " + planoPosTelefonia.getCodPlano());
		System.out.println("Descrição do plano pos Telefonia: " + planoPosTelefonia.getDescricaoPlano());
		System.out.println("Valor plano Pos Telefonia: " + planoPosTelefonia.getValorPlano());
		System.out.println("Franquia plano Pos Telefonia: " + planoPosTelefonia.getFranquiaMinutos());
		System.out.println("Minutos adicional Plano Pos Telefonia: " + planoPosTelefonia.getMinutoAdicional());
		
	}

}
