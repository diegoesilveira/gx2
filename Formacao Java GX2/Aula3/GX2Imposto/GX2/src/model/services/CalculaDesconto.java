package model.services;

import model.entities.Tecnico;

public class CalculaDesconto {

	private double calcula;
	DescontoINSS inss = new DescontoINSS();
	DescontoIR ir = new DescontoIR();
	public Tecnico solitaDados = new Tecnico();

	public void calculaDescontoTotal(double valorServico, double inss, double ir) {
		
		calcula = (valorServico - inss) - ir;
	}
	public double getCalcula() {
		return calcula;
	}

}
