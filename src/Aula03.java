public class Aula03 {

    public static void main(String[] args) {

        int anoLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.2;
        String tipoPlano = "plus";

        if(anoLancamento >= 2022){
            System.out.println("Filme e Lancamento!");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme ja disponivel");

        } else {
            System.out.println("Deve aguardar ser incluso no seu plano, ou pagar o plano Plus");
        }
    }
}
