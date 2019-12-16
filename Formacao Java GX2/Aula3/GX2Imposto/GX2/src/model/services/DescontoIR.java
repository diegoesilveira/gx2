 package model.services;

import model.entities.Tecnico;

public class DescontoIR implements TabelaDesconto {

	private double valorDescontoIR;
		

	public DescontoIR() {
	}

	public DescontoIR(double valorDescontoIR) {
		this.valorDescontoIR = valorDescontoIR;
	}

	@Override
	public void valorServico(double valor) {

		if (valor <= 1434.00) {
			valorDescontoIR = 0;
		} else if (valor >= 1434.01 & valor <= 2150.00) {
			valorDescontoIR = (valor * 0.075) + 107.55;

		} else if (valor >= 2150.01 & valor <= 2866.00) {
			valorDescontoIR = (valor * 0.15) + 268.80;
		} else if (valor >= 2866.01 & valor <= 3582.00) {
			valorDescontoIR = (valor * 0.225) + 483.75;
		} else {
			valorDescontoIR = (valor * 0.275) + 662.85;
		}
	}

	public double getValorDescontoIR() {
		return valorDescontoIR;
	}

}
