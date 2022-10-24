package br.com.lfr;

import java.util.Collections;
import java.util.Set;

public class testaVazio {


        public static void main(String[] args) {

            Set<String> nomes = Collections.emptySet();
            nomes.add("Paulo"); //o que acontece aqui?
        }

        //NÃO FUNCIONA

    }

