package aula7.projetos.exceptions;

public class ErroCadastroUsuarioException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ErroCadastroUsuarioException(String mensagem) {
		super(mensagem);
	}
}
