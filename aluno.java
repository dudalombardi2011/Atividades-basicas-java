public class aluno {
    private String nome;
    private double nota1, nota2, nota3;

    //isso serve para facilitar, na hora de criar o objeto a pessoa ja vai definir tudo junto, e se 
    //quiser mudar vai usar os setters
    public aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
        
    public void setnome(String nome){
        this.nome=nome;
    }

    public void setnota1(double nota1){
        this.nota1=nota1;
    }

    public void setnota2(double nota2){
        this.nota2=nota2;
    }

    public void setnota3(double nota3){
        this.nota3=nota3;
    }

    public String getnome(){
        return nome;
    }

    public double getnota1(){
        return nota1;
    }

    public double getnota2(){
        return nota2;
    }
    
    public double getnota3(){
        return nota3;
    }

    public double calcularmedia(){
        double media=(nota1+nota2+nota3)/3;
        return media;
    }


}
