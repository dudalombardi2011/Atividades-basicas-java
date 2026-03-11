import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha=scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$");
        //^ começo
        //lookaheads:
        //?=.* em algum lugar tem que ter
        //{8,} minimo 8 caracteres ate infinitos
        //?=.*[caracteres] em algum lugar tem que ter esses caracteres
        //restringe o que pode ter e indica o tamanho: [A-Za-z\\d@$!%*?&]{8,} É OBRIGATÓRIO
        //$acaba 

        Matcher matcher=pattern.matcher(senha);

        if(matcher.matches()){
            System.out.println("Senha válida");
        }else{
            System.out.println("Senha inválida");
        }

        scanner.close();
    }
}
