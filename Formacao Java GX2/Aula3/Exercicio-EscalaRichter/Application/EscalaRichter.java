public class EscalaRichter {

    public void escalaRichter(int valorEscala){

        if(valorEscala < 3.5){

            System.out.println("Escala Richter: " + valorEscala + " Geralmente não é sentido, mas pode ser registrado.");
        }
        else if(valorEscala >= 3.5 & valorEscala <= 5.4){
            System.out.println("Escala Richter: " + valorEscala + " Muitas vezes não é sentido, mas pode causar pequenos danos.");
        }
        else if(valorEscala >= 5.5 & valorEscala <= 6.0){
            System.out.println("Esclaa Richter: " + valorEscala + " Ocasiona pequenos danos em construções.");
        }
        else if(valorEscala >= 6.1 & valorEscala <= 6.9){
            System.out.println("Esclaa Richter: " + valorEscala + " Ocasiona pequenos danos em construções.");
        }
        else if(valorEscala >= 7.0 & valorEscala <= 7.9){
            System.out.println("Esclaa Richter: " + valorEscala + " Ocasiona pequenos danos em construções.");
        }
        else {
            System.out.println("Escala Richter: " + valorEscala + " Muito forte, causa destruição total no local antigido.");
        }
    }
}