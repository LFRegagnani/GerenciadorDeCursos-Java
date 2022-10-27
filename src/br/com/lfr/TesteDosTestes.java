package br.com.lfr;

public class TesteDosTestes {

    public static void main(String[]args){

        Curso curso = new Curso("Curso como ser brabo em Java","Luiz Fernando");

        Aluno a1 = new Aluno("Dunha",21);
        curso.matricula(a1);
        Aluno a2 = new Aluno("Raul",20);
        curso.matricula(a2);
        Aluno a3 = new Aluno("Doloroso",62);
        curso.matricula(a3);
        Aluno a4 = new Aluno("Zefa",55);

        System.out.println(curso.estaMatriculado(a4));


        System.out.println(curso.buscaMatriculado(21));


    }
}
