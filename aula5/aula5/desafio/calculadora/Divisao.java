package aula5.desafio.calculadora;

public class Divisao implements Calculadora {

	@Override
	public int operacao(int numero1, int numero2) {
		int resultado = 0;
		resultado = numero1 / numero2;
		return resultado;
	}
	

}
