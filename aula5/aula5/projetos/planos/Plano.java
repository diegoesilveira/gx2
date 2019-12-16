package aula5.projetos.planos;

public abstract class Plano {

	private int codPlano;
	private String descricaoPlano;
	private double valorPlano;

	public Plano() {
	}

	public Plano(int codPlano, String descricaoPlano, double valorPlano) {
		this.codPlano = codPlano;
		this.descricaoPlano = descricaoPlano;
		this.valorPlano = valorPlano;
	}

	public int getCodPlano() {
		return codPlano;
	}

	public void setCodPlano(int codPlano) {
		this.codPlano = codPlano;
	}

	public String getDescricaoPlano() {
		return descricaoPlano;
	}

	public void setDescricaoPlano(String descricaoPlano) {
		this.descricaoPlano = descricaoPlano;
	}

	public double getValorPlano() {
		return valorPlano;
	}

	public void setValorPlano(double valorPlano) {
		this.valorPlano = valorPlano;
	}

	@Override
	public String toString() {
		return "Plano [codPlano=" + codPlano + ", descricaoPlano=" + descricaoPlano + ", valorPlano=" + valorPlano
				+ "]";
	}

	
	
	

}
