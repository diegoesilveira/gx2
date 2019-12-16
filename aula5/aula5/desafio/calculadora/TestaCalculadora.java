package aula5.desafio.calculadora;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		Calculadora calcula = new Soma();
		
		System.out.println(calcula.operacao(20, 10));
		
		calcula = new Subtracao();
		System.out.println(calcula.operacao(20, 10));
		
		calcula = new Multiplicacao();
		System.out.println(calcula.operacao(20, 10));
		
		calcula = new Divisao();
		System.out.println(calcula.operacao(20, 10));
		
		
	}

}
