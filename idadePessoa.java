public class idadePessoa {
    private String nome;
    private int idade;

    void setnome(String nome){
        this.nome=nome;
    }

    void setidade(int idade){
        this.idade=idade;
    }

    int getidade(){
        return idade;
    }

    String getnome(){
        return nome;
    }

    void Verificaidade(){
        //não precisa de parametro pq ele consegue acessar atributos da ua mesma classe, e o set ja 
        //atribuiu valor a esse atributo 
        if (idade>=18){
            System.out.println(nome+" é maior de idade");
        }else{
            System.out.println(nome+" não é maior de idade");
        }
    }

}
