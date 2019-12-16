package model.entities;

public class Tecnico {
	
	private String nome;
	private String endereco;
	private String cpf;
	private String matriculaINSS;
	private double valorServico;
	
	
	public Tecnico() {
	}

	public Tecnico(String nome, String endereco, String cpf, String matriculaINSS, double valorServico) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.matriculaINSS = matriculaINSS;
		this.valorServico = valorServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatriculaINSS() {
		return matriculaINSS;
	}

	public void setMatriculaINSS(String matriculaINSS) {
		this.matriculaINSS = matriculaINSS;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}
	
	
}
