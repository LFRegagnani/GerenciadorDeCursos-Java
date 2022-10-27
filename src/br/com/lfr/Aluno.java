package br.com.lfr;

public class Aluno implements Comparable{

    private String nome;
    private int matricula;

    Aluno(String nome,int matricula){
        if(nome == null){
            throw new RuntimeException("O nome não pode ser null");

        }
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + " Numero da matricula nº "+ this.matricula;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
