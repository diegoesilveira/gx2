package aula5.contabancaria.operacoes;

import aula5.contabancaria.clientes.Cliente;

public interface Operacoes {
			
	public void depositar(double valor);
	public void transferir(double valor);
	public void sacar(double valor);

	

}
