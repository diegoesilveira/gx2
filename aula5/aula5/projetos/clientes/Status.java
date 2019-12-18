package aula5.projetos.clientes;

public enum Status {
	
	ATIVO(1,"Ativo"),
	INATIVO(2,"Inativo"),
	BLOQUEADO(3,"Bloqueado");

	private int codigo;
	private String descricao;
	
	private Status(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer codigo) {
		
		if(codigo == null) {
			return null;
		}
		
		for(Status status : Status.values()) {
			if(codigo.equals(status.getCodigo())) {
				return status;
			}
		}
		
		throw new IllegalArgumentException("Codigo invalido!");
	}
	
	
	
	
	
}
