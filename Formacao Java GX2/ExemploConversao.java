public class ExemploConversao {
    public static void main(String[] args) {
        
        double valorDouble = 1.99;
        float valorFloat = 1.99F;
        valorDouble = valorFloat;
        System.out.println("O valor é: " + valorDouble);

        long valorLong = 10;
        int valorInt;

        valorInt =(int) valorLong;

        System.out.println("O valor é: " + valorInt);

        double preco = 1.99;
        int cupom;
        cupom = (int) preco;
        System.out.println("O valor é: " + cupom);
    }
}