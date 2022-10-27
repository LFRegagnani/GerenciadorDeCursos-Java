package br.com.lfr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExercicioDesafio {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");


        Iterator<Integer> iterator = pessoas.keySet().iterator();

        while(iterator.hasNext()){
            System.out.println(pessoas.get(iterator.next()));
        }


    }
}

