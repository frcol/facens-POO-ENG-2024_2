package Aula7_ArrayList.Tarefa;

import java.util.ArrayList;

public class OrganizadorDeMusicas {
    private ArrayList<Faixa> faixas;

    public OrganizadorDeMusicas() {
        this.faixas = new ArrayList<>();
    }

    // Adicionar faixa com informa��es detalhadas
    public void adicionarFaixa(String titulo, String artista, int duracao) {
        Faixa novaFaixa = new Faixa(titulo, artista, duracao);
        faixas.add(novaFaixa);
    }

    // Adicionar faixa j� criada
    public void adicionarFaixa(Faixa faixa) {
        faixas.add(faixa);
    }

    // Listar todas as faixas
    public void listarTodasAsFaixas() {
        for (int i = 0; i < faixas.size(); i++) {
            System.out.print((i + 1) + ". ");
            faixas.get(i).print();
        }
        
        System.out.println("");
    }

    // Reproduzir faixa por �ndice
    public void reproduzirFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            faixas.get(indice).reproduzir();
        } else {
            System.out.println("Faixa inv�lida.");
        }
    }

    // Remover faixa por �ndice
    public void removerFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            faixas.remove(indice);
        } else {
            System.out.println("�ndice inv�lido.");
        }
    }
}

