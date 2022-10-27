package br.com.lfr;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Xconhecendo mais de listas";
        String aula2 = "AModelando a classe aula";
        String aula3 = "BTrabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        for (String a : aulas) {
            System.out.println(a);
        }

        aulas.forEach(a -> {
            System.out.print("eitaaaaaaaa");
            System.out.println("HIIIRUUUUU");
        });

        Collections.sort(aulas);

        System.out.println(aulas);
    }
}
