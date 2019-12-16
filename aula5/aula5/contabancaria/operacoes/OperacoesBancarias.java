package aula5.contabancaria.operacoes;

import aula5.contabancaria.clientes.Cliente;
import aula5.contabancaria.contas.Conta;
import aula5.contabancaria.contas.ContaCorrente;
import aula5.contabancaria.contas.ContaEspecial;
import aula5.contabancaria.contas.ContaPoupanca;
import aula5.contabancaria.contas.ContaSalario;

public class OperacoesBancarias {
	
	public static void processaOperacao() {
		
		Conta contaCorrente = new ContaCorrente(20, 200, 0.6);
		Conta contaSalario = new ContaSalario(5);
		Conta contaPoupanca = new ContaPoupanca(10);
		Conta contaEspecial = new ContaEspecial(25, 700, 0.10);
		
		Cliente cliente = new Cliente("Diego", "01598906088", contaCorrente);
		Cliente cliente2 = new Cliente("Victor", "0123066666666", contaPoupanca);
		Cliente cliente3 = new Cliente("Joao", "0505066666666", contaEspecial);
		Cliente cliente4 = new Cliente("Pedro", "1234566666666", contaSalario);
		
		cliente.getConta().depositar(500);
		cliente.getConta().depositar(500);
		cliente.getConta().sacar(500);
		cliente.getConta().transferir(400);
		
		cliente2.getConta().depositar(500);
		cliente2.getConta().depositar(500);
		cliente2.getConta().sacar(500);
		cliente2.getConta().transferir(400);
		
		cliente3.getConta().depositar(500);
		cliente3.getConta().depositar(500);
		cliente3.getConta().sacar(500);
		cliente3.getConta().transferir(400);
		
		cliente4.getConta().depositar(500);
		cliente4.getConta().depositar(500);
		cliente4.getConta().sacar(500);
		cliente4.getConta().transferir(400);		
				
		System.out.println("Cliente: " + cliente.getNomeCliente() + "\nSaldo: " + cliente.getConta().getSaldo() + " Limite: " + cliente.getConta().getLimite());
		System.out.println("Cliente: " + cliente2.getNomeCliente() + "\nSaldo: " + cliente2.getConta().getSaldo() + " Limite: " + cliente2.getConta().getLimite());
		System.out.println("Cliente: " + cliente3.getNomeCliente() + "\nSaldo: " + cliente3.getConta().getSaldo() + " Limite: " + cliente3.getConta().getLimite());
		System.out.println("Cliente: " + cliente4.getNomeCliente() + "\nSaldo: " + cliente4.getConta().getSaldo() + " Limite: " + cliente4.getConta().getLimite());

		Extrato.geraExtrato(cliente);
		Extrato.geraExtrato(cliente2);
		Extrato.geraExtrato(cliente3);
		Extrato.geraExtrato(cliente4);


		
	}
    
    
}
