package aula7.projetos.model.user;

public class Usuario {
	
	private int codigoUsuario;
	private String nomeUsuario;
	private String usuario;
	private String email;
	private String senha;
	private TipoUsuario tipoUsuario;
	
		
	public Usuario() {
	}

	public Usuario(int codigoUsuario, String nomeUsuario, String usuario, String email, String senha,
			TipoUsuario tipoUsuario) {
	
		this.codigoUsuario = codigoUsuario;
		this.nomeUsuario = nomeUsuario;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	

}
