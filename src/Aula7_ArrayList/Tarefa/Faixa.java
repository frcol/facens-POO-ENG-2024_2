package Aula7_ArrayList.Tarefa;

public class Faixa {
    private String titulo;
    private String artista;
    private int duracao;

    public Faixa(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void print() {
        System.out.println("Título: " + titulo + ", Artista: " + artista + ", Duração: " + duracao + " segundos");
    }

    public void reproduzir() {
        System.out.println("Reproduzindo: " + titulo + " por " + artista);
    }
}

