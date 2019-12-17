package aula5.contabancaria.contas;

import aula5.contabancaria.clientes.Cliente;
import aula5.contabancaria.operacoes.Taxa;

public class ContaEspecial extends Conta{

	public ContaEspecial(double tarifa, int limite, double juros) {
		super(tarifa, limite, juros);
	}

	@Override
	public void depositar(double valor) {
		calculaOperacao = ((getSaldo() + valor) - (valor * Taxa.getTaxacontaespecial()));
		setSaldo(calculaOperacao);
	}

	@Override
	public void transferir(double valor) {
		if(valor > getSaldo()) {
			System.out.println("Saldo insuficiente:");
		} else {
			calculaOperacao = ((getSaldo() - valor) - (valor * Taxa.getTaxacontaespecial()));
			setSaldo(calculaOperacao);
		}
	}

	@Override
	public void sacar(double valor) {
		if(valor > getSaldo()) {
			System.out.println("Não foi possivel realizar a operação, saldo insuficiente: Saldo: " + getSaldo());
		} else {
			calculaOperacao = (getSaldo() - valor) - (valor * Taxa.getTaxacontaespecial());
			setSaldo(calculaOperacao);
			
		}
	}

	
	
	

}
