package aula5.contabancaria.contas;

import aula5.contabancaria.operacoes.Operacoes;


public abstract class Conta implements Operacoes{
	
	private double tarifa;
	private double limite;
	private double juros;
	private double saldo;
	protected double calculaOperacao = 0;
	

	public Conta() {
	}

	public Conta(double tarifa) {
		this.tarifa = tarifa;
	}

	public Conta(double tarifa, double limite, double taxa) {
		this.tarifa = tarifa;
		this.limite = limite;
		this.juros = taxa;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxa() {
		return juros;
	}

	public void setTaxa(double taxa) {
		this.juros = taxa;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
