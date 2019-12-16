package aula5.projetos.planos.telefonia;

public class PlanoPreTelefonia extends PlanoTelefonia {

	private int bonus;

	public PlanoPreTelefonia() {
		
	}
	
	public PlanoPreTelefonia(int codPlano, String descricaoPlano, double valorPlano, int franquiaMinutos, int bonus) {
		super(codPlano, descricaoPlano, valorPlano, franquiaMinutos);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
