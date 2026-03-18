import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem vindo ao Banco Brasileiro, deseja abrir sua conta? Digite 1 para sim e 2 para não");
        int abrirconta= scanner.nextInt();
        scanner.nextLine();
        //limpa buffer

        if (abrirconta==1){
            ContaBancaria conta;
           System.out.println("Digite o nome do titular: ");
           String titular = scanner.nextLine();
           System.out.println("Digite o número da conta: ");
           int numeroconta = scanner.nextInt();
           scanner.nextLine();
           System.out.println("Deseja depositar algum valor inicial? (s/n)");
           String valorinicial = scanner.nextLine();
           if (valorinicial.equals("s")){
            System.out.println("Digite o valor do depósito inicial");
            double depositoinicial = scanner.nextDouble();
            conta = new ContaBancaria(numeroconta,titular,depositoinicial);
           }else{
            conta = new ContaBancaria(numeroconta,titular);
           }
           System.out.println(conta);
           System.out.println("informe um valor de deposito:");
           double valordeposito = scanner.nextDouble();
           conta.deposito(valordeposito);
           System.out.println("Dados da conta: ");
           System.out.println(conta);
           System.out.println("digite valor do saque: ");
           double valorsaque = scanner.nextDouble();
           conta.retirada(valorsaque);
           System.out.println(conta);

        }else{
            System.out.println("Volte sempre!");
        }
        scanner.close();
    }
}
