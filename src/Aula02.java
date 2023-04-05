public class Aula02 {

    public static void main(String[] args) {

        System.out.println("Esse e o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.2;

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
       String sinopse;
        sinopse = """
                Filme Top Gun Maverick
                Acao com Tom Cruise
                Ano de lancamento: 
                """ + anoLancamento;
        System.out.println(sinopse);

        //exemplo de format
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


    }
}
