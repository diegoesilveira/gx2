package Aula3.Imposto.application;

import java.util.Scanner;

//import Aula3.Imposto.model.entities.Pessoa;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.next();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.next();
        System.out.println("Digite Matricula do INSS: ");
        String matriculaINSS = scanner.next();

        Pessoa tecnico = new Pessoa(nome, endereco, cpf, matriculaINSS);
        

        scanner.close();
    }
}