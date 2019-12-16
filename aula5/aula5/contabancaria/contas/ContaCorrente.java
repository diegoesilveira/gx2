package aula5.contabancaria.contas;

import aula5.contabancaria.operacoes.Taxa;

public class ContaCorrente extends Conta {

	public ContaCorrente(double tarifa, double limite, double juros) {
		super(tarifa, limite, juros);
	}

	@Override
	public void depositar(double valor) {
		calculaOperacao = ((getSaldo() + valor) - (valor * Taxa.getTaxacontacorrente()));
		setSaldo(calculaOperacao);
	}

	@Override
	public void transferir(double valor) {
		if (valor > getSaldo()) {
			System.out.println("Saldo insuficiente:");
		} else {
			calculaOperacao = ((getSaldo() - valor) - (valor * Taxa.getTaxacontacorrente()));
			setSaldo(calculaOperacao);

		}
	}

	@Override
	public void sacar(double valor) {
		if (valor > getSaldo()) {
			System.out.println("Não foi possivel realizar a operação, saldo insuficiente: Saldo: " + getSaldo());
		} else {
			calculaOperacao = (getSaldo() - valor);
			setSaldo(calculaOperacao);

		}
	}
}
