import java.util.Scanner;
public class PensionatoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //a gente esta crinaod um vetor para armazenar os que vao alugar quartos
        //Pensionato[] cria um vetor do objeto pensionato
        //quartos é o nome do meu vetor
        Pensionato[] quartos = new Pensionato[10];
        System.out.println("Digite a quantidade de pessoas que vao alugar quartos (1-10)");
        int npessoas = sc.nextInt();
        for (int i = 0; i < npessoas; i++) {
            System.out.println("Locatário: ");
            sc.nextLine();
            String nome=sc.nextLine();
            System.out.println("Email: ");
            String email=sc.nextLine();
            System.out.println("Número do quarto alugado: ");
            int quarto = sc.nextInt();
            //aqui é onde oficialmente eu crio meu objeto, que vai ocupar a posição quartos-1 no meu vetor
            //quartos
            quartos[quarto-1]=new Pensionato(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if(quartos[i]!=null){
                System.out.println("Quarto " + (i+1)+":\n");
                System.out.println(quartos[i]);
            }
            
        }

        sc.close();
        
    }
}
