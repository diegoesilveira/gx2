package aula5.projetos.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import aula5.projetos.clientes.Cidade;
import aula5.projetos.clientes.Cliente;
import aula5.projetos.clientes.StatusCliente;
import aula5.projetos.planos.Plano;
import aula5.projetos.planos.internet.PlanoPosInternet;


public class ReciboClienteTxt {
	
	File file = new File("fatura.txt");
	Plano planoPosInternet = new PlanoPosInternet();
	
		
	Cliente cliente = new Cliente();
	

	public void gerarReciboCliente(Cliente cliente, Plano plano) {
		
		
		try {
			BufferedWriter saida = new BufferedWriter(new FileWriter(file, false));

			
			saida.write("----------------------------------------Cliente------------------------------------------------------------------------\n");

			saida.write("Nome: " + cliente.getNomeCliente() + "\n");
			saida.write("CPF: " + cliente.getCpfCliente() + "\n");
			saida.write("RG: " + cliente.getRgCliente() + "\n");
			saida.write("E-mail: " + cliente.getEmail() + "\n");
			saida.write("Data Nascimento: " + cliente.getDataNascimentoCliente() + "\n");
			saida.write("Status: " + cliente.getStatus() + "\n");
			saida.write("Endereço: " + cliente.getEnderecoCliente() + "\n");
			saida.write("Cidade: " + cliente.getCidade() + "\n");
			saida.write("CEP: " + cliente.getCepCliente() + "\n");
			saida.write("Telefone: " + cliente.getTelefoneCliente() + "\n");

			saida.write("----------------------------------------Planos Ativos:--------------------------------------------------------------- \n");

			saida.write("Código do plano: " + plano.getCodPlano() + "\n");
			saida.write("Descrição do plano: " + plano.getDescricaoPlano() + "\n");
			saida.write("Valor do plano: " + plano.getValorPlano() + "\n");
//			saida.write("Franquia plano Telefonia Pre: " + plano.getFranquiaMinutos() + "\n");
//			saida.write("Bonus plano Telefonia Pre: " + plano.getBonus() + "\n");
//			
			saida.write("-----------------------------------------------------------------------------------------------------------------------\n");
			saida.write("----------------------------------------Fatura a pagar:--------------------------------------------------------------- \n");
			saida.write("Valor a Pagar: " + plano.getValorPlano() + "\n");
			
			saida.flush();
			saida.close();

		} catch (IOException e) {
			System.out.println("Erro na criacao do arquivo." + e);
		}

	}

}
