public class estoquemain {
    public static void main(String[] args) {
        estoque produto1= new estoque();

        produto1.setnome("Camisa");
        produto1.setpreco(24);
        produto1.setqtd(3);

        estoque produto2 = new estoque();

        produto2.setnome("Shorts");
        produto2.setpreco(24.9);
        produto2.setqtd(0);

        produto1.exibeproduto();
        produto1.SaidadeProduto(1);
        produto2.exibeproduto();
        produto2.EntradadeProduto(7);
    }
}
