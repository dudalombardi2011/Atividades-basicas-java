public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;
    
    //nao precisa botar public pq ta tudo no mesmo pacote aqui nessa pasta, mas botei por bons modos

    //como a conta tem que nascer com esses objetos, cria-se o construtor 

    //esse construtor é pra caso exista um valor inicial 
    public ContaBancaria(int numeroConta, String titular, double depositoinicial){
        this.numeroConta=numeroConta;
        this.titular=titular;
        depositoinicial=deposito(depositoinicial);
    } //deposito inicial nao é usado mais pra nada, nao faz sentido fazer o set so pra ele,
    //e nao foi feito paenas 1 construtor com valor inicial podendo colocar ele como 0 pq
    //confundiria: isso é deposito inicial ou um 0?

    //já esse construtor é pra caso nao tenha deposito inicial
    public ContaBancaria(int numeroConta, String titular){
        this.numeroConta=numeroConta;
        this.titular=titular;
    }

    //como nao pode alterar o numero da conta, não se faz o setter, apenas o get para quando quiser imprimir algo etc
    public int getnumeroconta(){
        return numeroConta;
    }

    public double getsaldo(){
        return saldo;
    }

    //nao faz o setsaldo pq ele nao pode ser mudado assim, apenas com deposito ou retiradas

    //é o único mutável 
    public void settitular(String titular){
        this.titular=titular;
    }

    //se em algum momento vamos precisar printar, precisa fazer uma função get, se algo eh imutavel
    //nao se usa a função set, coloca ele no construtor 
    //criamos o construtor com as coisas que a conta ja precisa nascer com

    //printar tudo com um sysout(Conta):
    public String toString(){
        return "Conta: "+numeroConta + "\n" +
        "Nome titular: "+titular+ "\n" +
        "Saldo: "+saldo;
    }

    public double deposito(double valor){
        saldo+=valor;
        return saldo;
    }

    public double retirada(double valor){
        saldo-=valor + 5.0; //valor da taxa de saque, e é a mesma coisa que saldo-=(valor+5)
        return saldo;
    }
    


}
