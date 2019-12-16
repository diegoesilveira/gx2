package aula5.projetos.planos.telefonia;

import aula5.projetos.planos.Plano;

public abstract class PlanoTelefonia extends Plano{
	
	private int franquiaMinutos;

	public PlanoTelefonia() {
	}

	public PlanoTelefonia(int codPlano, String descricaoPlano, double valorPlano, int franquiaMinutos) {
		super(codPlano, descricaoPlano, valorPlano);
		this.franquiaMinutos = franquiaMinutos;
	}

	public int getFranquiaMinutos() {
		return franquiaMinutos;
	}

	public void setFranquiaMinutos(int franquiaMinutos) {
		this.franquiaMinutos = franquiaMinutos;
	}
	
	
}
