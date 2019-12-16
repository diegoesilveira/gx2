public class OperadorTernario {

    public static void main(String[] args) {
        
        /* double valor = 0;
        double valor1 = 1;
        double valor2 = 2;

        if(valor1 > valor2){
            valor = 100;
        } 
        else {
            valor = 50;
        }

        System.out.println("Valor vale: " + valor);

        valor = valor1 > valor2 ? 100:50;

        System.out.println(valor); */

        String status = "";
        int grade = 20;

        status = (grade >= 60) ? "Aprovado":"Reprovado";
        System.out.println(status);
    }
}