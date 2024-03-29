package aula5.contabancaria.contas;

import aula5.contabancaria.clientes.Cliente;
import aula5.contabancaria.operacoes.Taxa;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(double tarifa) {
		super(tarifa);
			
	}

	@Override
	public void depositar(double valor) {
		calculaOperacao = ((getSaldo() + valor) - (valor * Taxa.getTaxacontapoupanca()));
		setSaldo(calculaOperacao);
	}

	@Override
	public void transferir(double valor) {
		if(valor > getSaldo()) {
			System.out.println("Saldo insuficiente:");
		} else {
			calculaOperacao = ((getSaldo() - valor) - (valor * Taxa.getTaxacontapoupanca()));
			setSaldo(calculaOperacao);
		}
	}

	@Override
	public void sacar(double valor) {
		if(valor > getSaldo()) {
			System.out.println("N�o foi possivel realizar a opera��o, saldo insuficiente: Saldo: " + getSaldo());
		} else {
			calculaOperacao = (getSaldo() - valor) - (valor * Taxa.getTaxacontapoupanca());
			setSaldo(calculaOperacao);
			
		}
	}


	

}
