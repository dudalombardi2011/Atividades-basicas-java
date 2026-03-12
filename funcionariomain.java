import java.util.Scanner;
public class funcionariomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        funcionario f1 = new funcionario();
        System.out.println("Diga o nome do funcionário: ");
        String nome = scanner.nextLine();
        f1.setnome(nome);
        System.out.println("Digite o salário bruto do funcionário: ");
        double salario = scanner.nextDouble();
        f1.setsalario(salario);
        System.out.println("Digite o imposto: ");
        double imposto = scanner.nextDouble();
        f1.setimposto(imposto);
        f1.exibedados();
        System.out.println("Digite a porcentagem do aumento: ");
        double porcentagem = scanner.nextInt();
        f1.aumentosalario(porcentagem);
        f1.exibedados();;

        scanner.close();

    }
}
