public class estoque {
    private String nome;
    private double preco;
    private int qtd;


    public void setnome(String nome){
        this.nome=nome;
    }

    public void setpreco(double preco){
        this.preco=preco;
    }

    public void setqtd(int qtd){
        this.qtd=qtd;
    }

    public double getpreco(){
        return preco;
    }

    public int getqtd(){
        return qtd;
    }

    public String getnome(){
        return nome;
    }

    public void exibeproduto(){
        System.out.println("Nome do produto: " + getnome());
        System.out.println("Preço do produto: R$"+getpreco());
        System.out.println("Quantidade no estoque: "+ getqtd());
    }

    public void EntradadeProduto(int quantidade){
        qtd+=quantidade;
        exibeproduto();
    }

    public void SaidadeProduto(int quantidade2){
        qtd-=quantidade2;
        exibeproduto();
    }



}
