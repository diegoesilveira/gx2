package aula5.projetos.clientes;

import java.util.Date;

import aula5.projetos.planos.Plano;
import aula5.projetos.planos.telefonia.PlanoPreTelefonia;

public class Cliente {

	private String nomeCliente;
	private String cpfCliente;
	private String rgCliente;
	private String email;
	private Date dataNascimentoCliente;
	private StatusCliente statusCliente;
	private String enderecoCliente;
	private Cidade cidade;
	private String cepCliente;
	private String telefoneCliente;

	
	public Cliente() {
	}

	public Cliente(String nomeCliente, String cpfCliente, String rgCliente, String email, Date dataNascimentoCliente,
			StatusCliente statusCliente, String enderecoCliente, Cidade cidade, String cepCliente, String telefoneCliente) {

		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.rgCliente = rgCliente;
		this.email = email;
		this.dataNascimentoCliente = dataNascimentoCliente;
		this.statusCliente =statusCliente;
		this.enderecoCliente = enderecoCliente;
		this.cidade = cidade;
		this.cepCliente = cepCliente;
		this.telefoneCliente = telefoneCliente;
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getRgCliente() {
		return rgCliente;
	}

	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}

	public void setDataNascimentoCliente(Date dataNascimentoCliente) {
		this.dataNascimentoCliente = dataNascimentoCliente;
	}

	public StatusCliente getStatus() {
		return statusCliente;
	}

	public void setStatus(StatusCliente statusCliente) {
		this.statusCliente = statusCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getCepCliente() {
		return cepCliente;
	}

	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	
	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + ", rgCliente=" + rgCliente
				+ ", email=" + email + ", dataNascimentoCliente=" + dataNascimentoCliente + ", status Cliente=" + statusCliente
				+ ", enderecoCliente=" + enderecoCliente + ", cidade=" + cidade + ", cepCliente=" + cepCliente
				+ ", telefoneCliente=" + telefoneCliente + "]";
	}

	
}
