package br.com.lfr;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaDeAula {
    public static void main(String []args){

        Aula a1 = new Aula("Revisitando as ArrayLists",21);
        Aula a2 = new Aula("Listas de objetos",15);
        Aula a3 = new Aula("Relacionamentos de listas e objetos",15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        aulas.add(new Aula("Equals e hashCode",15));

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);


    }
}
