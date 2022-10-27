package br.com.lfr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercicios {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Luiz", 30);
        Funcionario f2 = new Funcionario("Iron", 31);
        Funcionario f3 = new Funcionario("Zé", 25);

        Set<Funcionario> listaArvore = new TreeSet();
        listaArvore.add(f1);
        listaArvore.add(f2);
        listaArvore.add(f3);

        Iterator itera = listaArvore.iterator();

        while(itera.hasNext()){
            System.out.println(itera.next());
        }

    }
}
