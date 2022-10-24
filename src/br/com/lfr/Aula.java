package br.com.lfr;

public class Aula implements Comparable<Aula>{

    private String titulo;

    private int tempo;


    Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    @Override
    public int compareTo(Aula aula) {
        return this.titulo.compareTo(aula.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }
}
