package aula5.desafio;

import java.text.DecimalFormat;

public class MaquinaDeBala {

	public static void main(String[] args) {

		float bala = 0.15f;
		float dinheiro = 1.50f;
		int quantidade = 0;

		while (dinheiro > bala) {

			dinheiro -= bala;
			quantidade++;

		}

		System.out.println("Quantidade de balas compradas: " + quantidade + " dinheiro disponivel: "
				+ String.format("%.2f", dinheiro));
	}

}
