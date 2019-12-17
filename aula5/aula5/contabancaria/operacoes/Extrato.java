package aula5.contabancaria.operacoes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import aula5.contabancaria.clientes.Cliente;


public class Extrato {
	
	public static void geraExtrato(Cliente cliente) {
		
		File file = new File(cliente.getNomeCliente()+".txt");
		
		try(BufferedWriter saida = new BufferedWriter(new FileWriter(file, false))) {
						
			saida.write("------------------------------------EXTRATO-BANCARIO-----------------------------------------------------");
			saida.write("\nNome: " + cliente.getNomeCliente() + "\n");
			saida.write("CPF: " + cliente.getCpfCliente() + "\n");
			saida.write("Saldo atual: R$:"+ cliente.getConta().getSaldo() + "\n");
			saida.write("--------------------------------------INFORMACOES--------------------------------------------------------");
			saida.write("\nTarifa conta: R$:"+ cliente.getConta().getTarifa() + "\n");
			saida.write("Limite: R$:"+ cliente.getConta().getLimite() + "\n");
			saida.write("Taxa: R$:"+ cliente.getConta().getTaxa() + "\n");
			saida.write("---------------------------------------------------------------------------------------------------------");
					
		} catch(IOException e) {
			System.out.println("Erro ao criar o arquivo.");
		}

			
	}

}
