package aula5.projetos.planos.telefonia;

public class PlanoPosTelefonia extends PlanoTelefonia {

	private double minutoAdicional;

	public PlanoPosTelefonia() {
	
	}
	
	public PlanoPosTelefonia(int codPlano, String descricaoPlano, double valorPlano, int franquiaMinutos, double minutoAdicional) {
		super(codPlano, descricaoPlano, valorPlano, franquiaMinutos);
		this.minutoAdicional = minutoAdicional;
	}

	public double getMinutoAdicional() {
		return minutoAdicional;
	}

	public void setMinutoAdicional(double minutoAdicional) {
		this.minutoAdicional = minutoAdicional;
	}
		
}
