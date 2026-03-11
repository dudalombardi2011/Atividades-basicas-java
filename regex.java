import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
public class regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double numero = scanner.nextDouble();
        System.out.println("Valor formatado: "+String.format("R$ %.2f", numero));

        scanner.nextLine();
        //limpa

        System.out.println("Digite o código: ");
        String codigo=scanner.nextLine();

        Pattern pattern=Pattern.compile("^[A-Z]{3}-\\d{4}$");
        //^ começo da string, [A-Z] letra maiuscula indo da A-Z, {3} repete 3x, - hifen, \\dcaracter(0-9)
        //{4} repete 4x, $ acaba ali
        Matcher matcher=pattern.matcher(codigo);

        if (matcher.matches()){
            System.out.println("Código válido");
        }else{
            System.out.println("Código inválido");
        }

        System.out.println("Digite seu cpf");
        String cpf=scanner.nextLine();
        pattern=Pattern.compile("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");
        matcher=pattern.matcher(cpf);
        if(matcher.matches()){
            System.out.println("CPF VÁLIDO");
        }else{
            System.out.println("CPF INVÁLIDO");
        }

        System.out.println("Digite sua frase: ");
        String frase=scanner.nextLine();

        pattern=Pattern.compile("#\\w+");
        //# é #, \\w é qualquer caracter letra, numero, _
        //+ pode ter repetições;
        matcher=pattern.matcher(frase);
        ArrayList<String> hashtags=new ArrayList<>();
        //cria lista para as # 

        while(matcher.find()){
            hashtags.add(matcher.group());
            //quando encontrar # adiciona
        }

        if(hashtags.isEmpty()){
            System.out.println("Sem hashtags");
        }else{
            System.out.println("Hashtags encontradas: "+String.join(", ", hashtags));
            //o join junta os itens da lista, primeiro o separador dps a lista
        }

        



        scanner.close();
    }   
    
}
