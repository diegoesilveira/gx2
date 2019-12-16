import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EscalaRichter escala = new EscalaRichter();
        System.out.println("Digite o valor da Escala Richter: " );
        double esc = scanner.nextDouble();
        escala.escalaRichter(esc);

        System.out.println("Digite um numero: ");
         int numero = scanner.nextInt();
        scanner.close();
    }
}