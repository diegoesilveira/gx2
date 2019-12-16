package aula5.desafio.calculadora;

public class Subtracao implements Calculadora {

	@Override
	public int operacao(int numero1, int numero2) {
		int restultado = 0;
		restultado = numero1 - numero2;
		return restultado;
	}

}
