package aula5.projetos.planos.internet;

import aula5.projetos.planos.Plano;

public abstract class PlanoInternet extends Plano{
	
	private int velocidade;
	private int franquiaDeDados;
	
	public PlanoInternet() {
	}

	public PlanoInternet(int codPlano, String descricaoPlano, double valorPlano, int velocidade, int franquiaDeDados) {
		super(codPlano, descricaoPlano, valorPlano);
		this.velocidade = velocidade;
		this.franquiaDeDados = franquiaDeDados;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public int getFranquiaDeDados() {
		return franquiaDeDados;
	}
	
	
	
	
	
	

}
