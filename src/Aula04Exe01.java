import java.util.Scanner;

public class Aula04Exe01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double saldo = 2500.00;
        int escolha = 0;
        System.out.println("************************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println();
        System.out.println("Nome:                        Thadeu Avancini");
        System.out.println("Tipo de Conta:               Corrente");
        System.out.println("Saldo inicial:               R$ " + saldo);
        System.out.println("************************************************");

        while(escolha != 4){
            System.out.println("Operacoes");
            System.out.println();
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Marque a opcao desejada: ");
            escolha = scan.nextInt();
            switch (escolha){
                case(1):
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case(2):
                    System.out.println("Digite o valor a ser recebido: ");
                    double acrescimo = scan.nextDouble();
                    saldo += acrescimo;
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case(3):
                    System.out.println("Digite o valor a ser transferido: ");
                    double retirada = scan.nextDouble();
                    if (retirada > saldo){
                        System.out.println("Saldo insuficiente, saldo atual: R$ " + saldo);
                    } else {
                        saldo -= retirada;
                        System.out.println("Saldo atual: R$ " + saldo);
                    }
                    break;
                case(4):
                    System.out.println("Saindo do sistema....");

            }
        }




    }
}
