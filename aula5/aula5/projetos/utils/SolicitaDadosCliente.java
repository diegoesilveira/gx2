package aula5.projetos.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import aula5.projetos.clientes.Cidade;
import aula5.projetos.clientes.Cliente;
import aula5.projetos.clientes.StatusCliente;
import aula5.projetos.planos.Plano;
import aula5.projetos.planos.internet.PlanoPosInternet;
import aula5.projetos.planos.internet.PlanoPreInternet;
import aula5.projetos.planos.telefonia.PlanoPosTelefonia;
import aula5.projetos.planos.telefonia.PlanoPreTelefonia;


public class SolicitaDadosCliente {
	
	ReciboClienteTxt geraArquivo = new ReciboClienteTxt();
	SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");

	public void entradaDadosCliente() {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Digite seu nome: ");
			String nomeCliente = scanner.nextLine();

			System.out.print("Digite seu CPF: ");
			String cpfCliente = scanner.nextLine();

			System.out.print("Digite seu RG: ");
			String rgCliente = scanner.nextLine();

			System.out.print("Digite seu e-mail: ");
			String emailCliente = scanner.nextLine();

			System.out.print("Digite sua data de nascimento no formato DD/MM/AAAA: ");
			String dataNascimento = scanner.nextLine();
			Date dataNascimentoFormatada = formatadorData.parse(dataNascimento);

			System.out.print("Digite o Status: Ativo, Inativo ou Bloqueado: ");
			String status = scanner.nextLine().toUpperCase();

			System.out.println("Digite Endereco: ");
			String enderecoCliente = scanner.nextLine();

			System.out.println("Digite a Cidade: ");
			String cidadeNome = scanner.nextLine();

			System.out.println("Digite seu CEP: ");
			String cepCliente = scanner.nextLine();

			System.out.println("Digite seu telefone: ");
			String telefoneCliente = scanner.nextLine();

			Cliente cliente = new Cliente(nomeCliente, cpfCliente, rgCliente, emailCliente, dataNascimentoFormatada,
					StatusCliente.valueOf(status), enderecoCliente, new Cidade(cidadeNome), cepCliente,
					telefoneCliente);

			Plano planoPreInternet = new PlanoPreInternet(01,"Plano Pre Internet", 29.9, 100, 400);
			Plano planoPosInternet = new PlanoPosInternet(02, "Plano Pos Internet", 69.99, 250,	150, 300);
		


			geraArquivo.gerarReciboCliente(cliente, planoPosInternet);

		} catch (InputMismatchException e) {
			System.out.println("Erro digite corretamente." + e);
		} catch (NumberFormatException e) {
			System.out.println("Erro verifique o valor digitado. " + e);
		} catch (ParseException e) {
			System.out.println("Erro digite a data corretamene DD/MM/AAAA.");
		} catch(java.lang.IllegalArgumentException e) {
			System.out.println("Erro digite corretamente o status.");
		}

	}

}
