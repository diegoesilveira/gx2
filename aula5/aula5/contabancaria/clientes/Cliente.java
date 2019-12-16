package aula5.contabancaria.clientes;

import java.util.Date;

import aula5.contabancaria.contas.Conta;
import aula5.projetos.clientes.Cidade;
import aula5.projetos.clientes.StatusCliente;

public class Cliente {

	private String nomeCliente;
	private String cpfCliente;
	private String rgCliente;
	private String email;
	private String dataNascimentoCliente;
	private String statusCliente;
	private String enderecoCliente;
	private String cidade;
	private String cepCliente;
	private String telefoneCliente;
	private Conta conta;

	public Cliente() {
	}

	public Cliente(String nomeCliente, String cpfCliente, Conta conta) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.conta = conta;
	}

	public Cliente(String nomeCliente, String cpfCliente, String rgCliente, String email, String dataNascimentoCliente,
			String statusCliente, String enderecoCliente, String cidade, String cepCliente, String telefoneCliente,
			Conta conta) {

		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.rgCliente = rgCliente;
		this.email = email;
		this.dataNascimentoCliente = dataNascimentoCliente;
		this.statusCliente = statusCliente;
		this.enderecoCliente = enderecoCliente;
		this.cidade = cidade;
		this.cepCliente = cepCliente;
		this.telefoneCliente = telefoneCliente;
		this.conta = conta;
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

	public String getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}

	public void setDataNascimentoCliente(String dataNascimentoCliente) {
		this.dataNascimentoCliente = dataNascimentoCliente;
	}

	public String getStatusCliente() {
		return statusCliente;
	}

	public void setStatusCliente(String statusCliente) {
		this.statusCliente = statusCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
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

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
