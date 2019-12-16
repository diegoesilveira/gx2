public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        
       // double livroJava8 = 59.90;
       // double livroTDD = 59.90;
        double soma = 0;
        int contador = 0;

        while(contador < 35) {
            double valorDoLivro = 59.90;
            soma+= valorDoLivro;
            contador ++;
        }
        System.out.println("O total em estoque é " + soma);

       // double soma = livroJava8 + livroTDD;

        System.out.println("O total de estoque e " + soma);

        if(soma < 150) {
            System.out.println("Seu estoque está muito abaixo.");
        }
        else if(soma >= 2000){
            System.out.println("Seu estoque está muito alto.");
        }
        else {
            System.out.println("Seu estoque está bom.");
        }
    }
}