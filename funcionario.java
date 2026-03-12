public class funcionario {
    private String nome;
    private double imposto;
    private double salario;

    public void setsalario(double salario){
        this.salario=salario;
    }

    public void setimposto(double imposto){
        this.imposto=imposto;
    }

    public void setnome(String nome){
        this.nome=nome;
    }

    public double getsalario(){
        return salario;
    }

    public double getimposto(){
        return imposto;
    }

    public String getnome(){
        return nome;
    }

    public double calcularsalarioliquido(){
        double salarioliquido = salario - imposto;
        return salarioliquido;
    }

    public void exibedados(){
        System.out.println("Nome do funcionário: "+ getnome());
        System.out.println("Salário líquido: "+ calcularsalarioliquido());
    }

    public void aumentosalario(double porcentagem){
        salario+=salario*(porcentagem/100);
    }
}
