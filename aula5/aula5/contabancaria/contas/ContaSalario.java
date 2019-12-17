package aula5.contabancaria.contas;

import aula5.contabancaria.clientes.Cliente;
import aula5.contabancaria.operacoes.Taxa;

public class ContaSalario extends Conta {

	public ContaSalario(double tarifa) {
		super(tarifa);

	}

	@Override
	public void depositar(double valor) {
		calculaOperacao = ((getSaldo() + valor) - (valor * Taxa.getTaxacontasalario()));
		setSaldo(calculaOperacao);
	}

	@Override
	public void transferir(double valor) {
		if(valor > getSaldo()) {
			System.out.println("Saldo insuficiente:");
		}
	}

	@Override
	public void sacar(double valor) {
		if(valor > getSaldo()) {
			System.out.println("Não foi possivel realizar a operação, saldo insuficiente: Saldo: " + getSaldo());
		} else {
			calculaOperacao = (getSaldo() - valor);
			setSaldo(calculaOperacao);
			
		}
	}

}
