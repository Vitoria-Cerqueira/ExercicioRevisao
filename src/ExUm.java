import java.util.Scanner;

public class ExUm {
    // não consegui finalizar
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Voce quer aumentar ou diminuir o volume?");
        System.out.println("1 - Para aumentar o volume \n 2 - Para trocar de canal \n 3 - Para consultar o volume e o canal");

        decisaoAcao(teclado.nextInt());

    }
    public static void decisaoAcao (int decisao) {

        switch (decisao){
            case 1:
                comandarVolume();
                break;
            case 2:
                mudarCanal();
                break;
            case 3:
                verificarCanalVolume();
                break;
            default:
                System.out.println("Invalido");
        }
    }
    public static int volume = 5;
    public static void comandarVolume(){
        System.out.println("Digite o volume que deseja");
        System.out.println("1 - para diminuir \n 2 - para aumentar");
        int decisaoDois = teclado.nextInt();

        switch (decisaoDois){
            case 1:
                if (volume >= 0 && volume <= 10) {
                    System.out.println(volume);
                    volume++;
                    break;
                }
                case 2:
                if (volume >= 0){
                    System.out.println(volume);
                    volume --;
                    break;
                }



        }


    }

    public static void mudarCanal(){

    }

    public static void verificarCanalVolume(){

    }
}
