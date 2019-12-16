package aula5.projetos.planos.tv;

import aula5.projetos.planos.Plano;

public class PacoteTv extends Plano{
	
	private int quantidadeDeCanais;
	
	public PacoteTv() {
	}

	public PacoteTv(int codPlano, String descricaoPlano, double valorPlano, int quantidadeDeCanais) {
		super(codPlano, descricaoPlano, valorPlano);
		this.quantidadeDeCanais = quantidadeDeCanais;
		
	}

	public int getQuantidadeDeCanais() {
		return quantidadeDeCanais;
	}

	public void setQuantidadeDeCanais(int quantidadeDeCanais) {
		this.quantidadeDeCanais = quantidadeDeCanais;
	}
	
}
