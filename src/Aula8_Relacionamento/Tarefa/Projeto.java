package Aula8_Relacionamento.Tarefa;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarTarefa(String descricao, Membro membro, String status) {
        Tarefa novaTarefa = new Tarefa(descricao, membro, status);
        tarefas.add(novaTarefa);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.print());
        }
    }

    public String print() {
        String msg = "Projeto: " + nome + " | Num Tarefas: " + tarefas.size();
        
        for (Tarefa tarefa : tarefas) {
            msg += "\n\t - "+tarefa.print();
        }
        
        return msg;
    }
}

