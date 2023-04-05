import java.util.Scanner;

public class Aula02Exe01 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = scan.nextDouble();
        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.println(String.format("%.1fC e igual a  %.1fF",temperatura,fahrenheit));




    }

}
