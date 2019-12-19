package aula7.projetos.model;

import aula5.projetos.clientes.Status;

public enum TipoUsuario {
	
	ADMINISTRADOR(1, "Administrador"),
	SUPERVISOR(2, "Supervisor"),
	OPERADOR(3, "Operador");

	private int codigo;
	private String descricao;
	
	private TipoUsuario(int codigo, String descricao) {
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
