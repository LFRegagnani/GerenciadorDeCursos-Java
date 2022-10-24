package br.com.lfr;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();


    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;

    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }


    @Override
    public String toString() {
        return "[Curso "+ this.nome + ". O tempo de duração é de " + this.tempoTotalDoCurso(this.aulas) + " minutos," + " E as aulas são: " + this.aulas + "]";
    }

    public void ordena(){
        List listaDeAulas = this.aulas;
        Collections.sort(listaDeAulas);
        this.aulas = listaDeAulas;
    }

    public int tempoTotalDoCurso(List<Aula> lista){
        int tempoTotal = 0;
        for (Aula aula: lista) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    public void matricula(Aluno a1) {
        Set aluninhos = this.alunos;
        aluninhos.add(a1);
        this.alunos = aluninhos;
    }

    //GETTs e SETTs

    public List getAulas(){
        return Collections.unmodifiableList(this.aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
}
