package br.com.lfr;

public class Aluno {

    private String nome;
    private int matricula;

    Aluno(String nome,int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + " Numero da matricula nº "+ this.matricula;
    }

    //GETTs & SETTs

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
