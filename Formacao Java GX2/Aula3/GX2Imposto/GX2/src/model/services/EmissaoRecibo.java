package model.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.entities.Tecnico;

public class EmissaoRecibo {

	Tecnico solitaDados = new Tecnico();
	DescontoINSS inss = new DescontoINSS();
	DescontoIR ir = new DescontoIR();
	CalculaDesconto calculaDesconto = new CalculaDesconto();

	public void geraTXT(String nome, String endereco, String cpf, String numeroINSS, double valorServico, double inss,
			double ir, double valorDesconto) {

		try {

			File arquivo = new File("recibo.txt");
			BufferedWriter saida = new BufferedWriter(new FileWriter(arquivo, false));

			saida.write("Nome: " + nome + "\n");
			saida.write("Endereco: " + endereco + "\n");
			saida.write("CPF: " + cpf + "\n");
			saida.write("Numero INSS: " + numeroINSS + "\n");
			saida.write("Valor do Serviço: " + valorServico + "\n");
			saida.write("Desconto INSS: " + inss + "\n");
			saida.write("Desconto IR: " + ir + "\n");
			saida.write("Valor Liquido: " + valorDesconto + "\n");
			saida.flush();
			saida.close();

		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo! ");
		}

	}

}
