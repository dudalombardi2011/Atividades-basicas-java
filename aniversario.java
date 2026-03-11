import java.util.ArrayList;
import java.util.Scanner;

public class aniversario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos montar a sua festa de aniversário? Digite sim ou não: ");
        String resposta=scanner.nextLine();
        if(resposta.equals("sim")){
            ArrayList<String> convidados = new ArrayList<>();
            System.out.println("Ótimo! Vamos começar...");
            String resposta2;
            do{
                System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
                resposta2=scanner.nextLine();
                if (resposta2.equals("ver")){
                    System.out.println("Mostrando lista atual de convidados:");
                    System.out.println(convidados);
                    System.out.println("Deseja continuar adicionando?Digite sim ou não");
                    String answer=scanner.nextLine();
                    if (answer.equals("sim")){
                        continue;
                    }else{
                        break;
                    }
                }else if(resposta2.equals("sair")){
                    System.out.println("Saindo da lista...");
                }else if(convidados.contains(resposta2)){
                    System.out.println("Esse nome já foi cadastrado!");
                }else{
                    convidados.add(resposta2);
                }

            }while(!resposta2.equals("sair"));
            System.out.println("Obrigada por montar sua festa conosco!");
            System.out.println("Deseja ver quantos convidados voce adicionou?");
            String qtd = scanner.nextLine();
            if (qtd.equals("sim")){
                System.out.println(convidados.size()+" convidados");
            }else{
                System.out.println("Ok!");
            }

        }

        System.out.println("Volte sempre!");

        scanner.close();
    }

    
}
