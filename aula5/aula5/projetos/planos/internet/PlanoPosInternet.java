package aula5.projetos.planos.internet;

public class PlanoPosInternet extends PlanoInternet{
	
	private double dadosAdicionais;

	public PlanoPosInternet() {
	
	}
	
	public PlanoPosInternet(int codPlano, String descricaoPlano, double valorPlano, int velocidade,
			int franquiaDeDados, double dadosAdicionais) {
		super(codPlano, descricaoPlano, valorPlano, velocidade, franquiaDeDados);
		this.dadosAdicionais = dadosAdicionais;
	}

	public double getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(double dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

}
