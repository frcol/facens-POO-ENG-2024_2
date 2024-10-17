package Aula8_Relacionamento.Tarefa;

public class MainProjeto {
    public static void main(String[] args) {
        Projeto projeto = new Projeto(1, "Vet");
        Membro membro1 = new Membro("Fabio", "Desenv");
        
        projeto.adicionarTarefa("tarefa1", membro1, "Andamento");
        projeto.adicionarTarefa("tarefa2", membro1, "concluido");
        System.out.println(projeto.print());
    }
}
