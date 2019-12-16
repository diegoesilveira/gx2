package aula5.contabancaria.operacoes;

public abstract class Taxa {
	
	private static final double TAXACONTAPOUPANCA = 0;
	private static final double TAXACONTASALARIO = 0;
	private static final double TAXACONTACORRENTE = 0.06;
	private static final double TAXACONTAESPECIAL = 0.02;
	
		
	public static double getTaxacontapoupanca() {
		return TAXACONTAPOUPANCA;
	}
	public static double getTaxacontasalario() {
		return TAXACONTASALARIO;
	}
	public static double getTaxacontacorrente() {
		return TAXACONTACORRENTE;
	}
	public static double getTaxacontaespecial() {
		return TAXACONTAESPECIAL;
	}

}
