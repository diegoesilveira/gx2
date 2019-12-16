package model.services;

public class DescontoINSS implements TabelaDesconto {

	private double valorDescontoINSS;
	
	public DescontoINSS() {
	}

	public DescontoINSS(double valorDescontoINSS) {
		this.valorDescontoINSS = valorDescontoINSS;
	}

	@Override
	public void valorServico(double valor) {

		if (valor <= 965.67) {
			valorDescontoINSS = (valor * 0.08);
		} else if (valor >= 965.68 & valor <= 1609.45) {
			valorDescontoINSS = (valor * 0.09);
		} else if (valor >= 1609.46 & valor <= 3218.90) {
			valorDescontoINSS = (valor * 0.11);
		} else {
			valorDescontoINSS = 354.08;
		}
	}

	public double getValorDescontoINSS() {
		return valorDescontoINSS;
	}
	
}
