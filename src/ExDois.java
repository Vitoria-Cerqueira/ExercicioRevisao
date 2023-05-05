import java.util.Scanner;

public class ExDois {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome");
        System.out.println(dizerInformacao(teclado.next()));


        System.out.println("Digite seu idade");
        System.out.println( dizerInformacao(teclado.nextInt()));

        System.out.println("Digite primeiro seu peso e depois sua altura");
        System.out.println(dizerInformacao(teclado.nextDouble(), teclado.nextDouble()));

    }

    public static String dizerInformacao(String nome){

        return "Meu nome é " + nome;
    }

    public static String dizerInformacao(int idade) {

        return "Minha idade é " + idade + " anos";
    }

    public static String dizerInformacao (double peso, double altura){

        return "Meu peso é " + peso + " Minha altura é " + altura;
    }

}
