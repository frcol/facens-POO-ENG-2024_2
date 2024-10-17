package Aula7_ArrayList.Tarefa;

public class MainMusicas {
    public static void main(String[] args) {
        OrganizadorDeMusicas org = new OrganizadorDeMusicas();
        
        Faixa faixa = new Faixa("Musica 1", "Artista 1", 12);
        
        org.adicionarFaixa(faixa);
        org.adicionarFaixa("Musca 2", "Artista 2", 3);
        
        org.listarTodasAsFaixas();
        
        org.reproduzirFaixa(0);
        org.removerFaixa(0);
        org.reproduzirFaixa(0);
        
    }

}
