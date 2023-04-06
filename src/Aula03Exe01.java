import java.util.Random;
import java.util.Scanner;

public class Aula03Exe01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int chute = -1;
        int tentativas = 5;
        System.out.println("Adivinhe o numero secreto entre 0 a 100");

        while(tentativas != 0){
            System.out.println("Diga seu chute, voce tem  " + tentativas + " tentativas");
            chute = scan.nextInt();
            tentativas --;
            if (chute == numeroSecreto){
                System.out.println("Parabens! Voce acertou!");
                break;
            } else if (chute > numeroSecreto){
                System.out.println("O numero secreto e menor");
            } else if (chute < numeroSecreto){
                System.out.println("O numero secreto e maior");
            }


        }
        if (tentativas == 0){
            System.out.println("Voce nao conseguiu adivinhar.");
        }

        System.out.println("O numero secreto e " + numeroSecreto);


    }
}
