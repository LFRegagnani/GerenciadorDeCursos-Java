package br.com.lfr;

public class TestaCursoComAluno {
    public static void main(String []args){


        Curso JavaColecoes = new Curso("Dominando coleções do Java","Paulo Silveira");

        Aula au1 = new Aula("Revisitando as ArrayLists",21);
        Aula au2 = new Aula("Listas de objetos",15);
        Aula au3 = new Aula("Relacionamentos de listas e objetos",15);

        JavaColecoes.adiciona(au1);
        JavaColecoes.adiciona(au1);
        JavaColecoes.adiciona(au1);

        Aluno a1 = new Aluno("Rodrigo T",3672);
        Aluno a2 = new Aluno("Rafa Cordeiro",1234);
        Aluno a3 = new Aluno("Dunha R",928927);
        Aluno a7 = new Aluno("Raul",30301);

        JavaColecoes.matricula(a1);
        JavaColecoes.matricula(a2);
        JavaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados no curso: ");
        for(Aluno a: JavaColecoes.getAlunos()){
            System.out.println(a.toString());
        }
        System.out.println(JavaColecoes.estaMatriculado(a2));

        Aluno luiz = new Aluno("luiz",2378932);
        Aluno luis = new Aluno("luis",2378931);

        System.out.println(luiz.hashCode());
        System.out.println(luis.hashCode());

        System.out.println(luiz.equals(luis));

    }


}
