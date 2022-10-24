package br.com.lfr;

import java.util.List;

public class TestaCurso {
    
    public static void main (String []args){

        Curso curso = new Curso("Dominando as Coleções do Java","Paulo Silveira");

        List aulas = curso.getAulas();

        System.out.println(aulas);

        //aulas.add(new Aula("Trabalhando com arrayList",21));

        System.out.println(aulas);

        curso.adiciona(new Aula("Trabalhando com ArrayList",22));
        curso.adiciona(new Aula("Criando uma aula",19));
        curso.adiciona(new Aula("Modelando com coleçoes",24));
        curso.adiciona(new Aula("Aula4",10));

        System.out.println(aulas);


    }
}
