import java.util.Scanner;

public class ExUm {

    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {


//        System.out.println("Voce quer aumentar ou diminuir o volume?");
//        System.out.println("Voce quer aumentar o canal ou diminuir de canal o volume?");
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
    public static int trocaCanal = 10;
    public static void comandarVolume(){
        System.out.println("Digite o que voce deseja");
        System.out.println("1 - para aumentar \n 2 - para diminuir");
        int decisaoDois = teclado.nextInt();

        switch (decisaoDois){
            case 1:
                if (volume >= 0 && volume <= 10) {
                    volume++;
                    System.out.println(volume);
                    break;
                }
                case 2:
                if (volume >= 0){
                    volume --;
                    System.out.println(volume);
                    break;
                }
        }
    }

    public static void mudarCanal(){

        System.out.println("Digite o que voce deseja");
        System.out.println("1 - para aumentar o numero do canal \n 2 - para diminuir o numero de canal ");
        int decisaoTres = teclado.nextInt();



            switch (decisaoTres) {
                case 1:
                    if (trocaCanal < 10) {
                        trocaCanal++;
                    }
                    System.out.println(trocaCanal);
                    break;

                case 2:
                    if (trocaCanal > 0) {
                        trocaCanal--;
                    }
                    System.out.println(trocaCanal);
                    break;

            }



    }

    public static void verificarCanalVolume(){
        System.out.println("O volume está em " + volume );
        System.out.println("O canal está em " + trocaCanal);
    }
}
