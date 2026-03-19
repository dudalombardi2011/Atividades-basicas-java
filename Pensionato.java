public class Pensionato {
    private String nome;
    private String email;

    public Pensionato(String nome, String email){
        this.nome=nome;
        this.email=email;
    }

    public String getemail(){
        return email;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome=nome;
    }

    public void setemail(String email){
        this.email=email;
    }

    public String toString(){
        return "nome: "+nome+"\n"+
        "email: "+email+"\n";
    }
}
