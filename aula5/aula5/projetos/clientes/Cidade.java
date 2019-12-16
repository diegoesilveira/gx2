package aula5.projetos.clientes;

public class Cidade {

	private String descricaoCidade;

	public Cidade() {
	}

	public Cidade(String descricaoCidade) {
		this.descricaoCidade = descricaoCidade;

	}

	public String getDescricaoCidade() {
		return descricaoCidade;
	}

	public void setDescricaoCidade(String descricaoCidade) {
		this.descricaoCidade = descricaoCidade;
	}

	@Override
	public String toString() {
		return "Cidade [descricaoCidade=" + descricaoCidade + "]";
	}
	
	

}
