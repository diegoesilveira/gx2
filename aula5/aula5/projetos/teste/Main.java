package aula5.projetos.teste;

import aula5.projetos.clientes.Cliente;
import aula5.projetos.utils.SolicitaDadosCliente;

public class Main {

	public static void main(String[] args) {

		SolicitaDadosCliente pegaDados = new SolicitaDadosCliente();
		pegaDados.entradaDadosCliente();
		Cliente cliente = new Cliente();
		cliente.getNomeCliente();

	}

}
