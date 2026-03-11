public class principal {
        
    public static void main(String[] args) {
        contaBancaria c1=new contaBancaria();
        c1.setnumeroConta(1990);
        c1.setsaldo(10000);
        c1.titular="Duda";
        System.out.println("Titulas: "+c1.titular);
        System.out.println("Numero da Conta: "+c1.getnumeroconta());
        System.out.println("Saldo: "+c1.getsaldo());
        c1.setsaldo(100009);
        System.out.println("Novo saldo: "+c1.getsaldo());

        idadePessoa p1=new idadePessoa();
        p1.setnome("duda");
        p1.setidade(19);
        System.out.println("A pessoa "+p1.getnome()+" tem "+p1.getidade()+" anos.");
        p1.Verificaidade();
        
    }
}

