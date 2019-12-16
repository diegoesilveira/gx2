package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Tecnico;
import model.services.CalculaDesconto;
import model.services.DescontoINSS;
import model.services.DescontoIR;
import model.services.EmissaoRecibo;

public class App {

	public static void main(String[] args) {

		CalculaDesconto calculaDesconto = new CalculaDesconto();
		DescontoINSS inss = new DescontoINSS();
		DescontoIR ir = new DescontoIR();

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite seu nome: \n");
			String nome = sc.nextLine();

			System.out.println("Digite seu endereco: \n");
			String endereco = sc.nextLine();

			System.out.println("Digite seu CPF: \n");
			String cpf = sc.nextLine();

			System.out.println("Digite a Matricula de INSS: \n");
			String matriculaINSS = sc.nextLine();

			System.out.println("Digite o valor do servico cobrado: \n");
			Double valorServico = Double.parseDouble(sc.nextLine());
			Tecnico solitaDados = new Tecnico(nome, endereco, cpf, matriculaINSS, valorServico);

			inss.valorServico(solitaDados.getValorServico());
			ir.valorServico(solitaDados.getValorServico());

			calculaDesconto.calculaDescontoTotal(valorServico, inss.getValorDescontoINSS(), ir.getValorDescontoIR());
			
			EmissaoRecibo geraArquivo = new EmissaoRecibo();
			geraArquivo.geraTXT(nome, endereco, cpf, matriculaINSS, valorServico, inss.getValorDescontoINSS(),
					ir.getValorDescontoIR(), calculaDesconto.getCalcula());

		} catch (InputMismatchException e) {
			e.printStackTrace();

		}

	}

}
