import java.util.Scanner;

public class Aula03c {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite nome do filme: ");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lancamento? ");
        int anoLancamento = leitura.nextInt();
        double media = 0;
        double nota = 0;
        int contagem = 0;

        while(nota != -1) {
            System.out.println("Diga sua avaliacao para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1){
                media += nota;
                contagem ++;
            }

        }



        System.out.println("Filme: " + filme);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Avaliacao: " + (media/contagem));
    }

}
