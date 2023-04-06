import java.util.Scanner;

public class Aula03b {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite nome do filme: ");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lancamento? ");
        int anoLancamento = leitura.nextInt();
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "º avaliacao do filme? ");
            nota = leitura.nextDouble();
            media += nota;


        }



        System.out.println("Filme: " + filme);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Avaliacao: " + (media/3));

    }

}
