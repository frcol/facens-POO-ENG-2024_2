package Aula8_Relacionamento.Tarefa;

public class Tarefa {
    private String descricao;
    private Membro membroResponsavel;
    private String status;

    public Tarefa(String descricao, Membro membroResponsavel, String status) {
        this.descricao = descricao;
        this.membroResponsavel = membroResponsavel;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Membro getMembroResponsavel() {
        return membroResponsavel;
    }

    public void setMembroResponsavel(Membro membroResponsavel) {
        this.membroResponsavel = membroResponsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String print() {
        return descricao + " (" + membroResponsavel.getNome() + ") - " + status;
    }
}

