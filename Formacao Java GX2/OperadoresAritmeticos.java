public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        double precoUnitario = 10.0;
        int quantidade = 20;
        double desconto = .10;
    
        double totalCompra = precoUnitario * quantidade;
        double parcelamento = totalCompra / 4;
        double compraDesconto = totalCompra * desconto;
        totalCompra -= compraDesconto;
        double juros = .05;
        double juroParcela = parcelamento * juros;
        parcelamento += juroParcela;
    
        System.out.println("Total da compra: " + totalCompra);
        System.out.println("Valor da parcela: " + parcelamento);
        System.out.println("Desconto: " + compraDesconto);
    }


}