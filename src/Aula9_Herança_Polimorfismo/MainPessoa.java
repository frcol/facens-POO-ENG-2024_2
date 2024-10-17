package Aula9_Herança_Polimorfismo;

public class MainPessoa {
    public static void main(String[] args) {
        Professor prof = new Professor("Fabio",
                "123123", "11111");
        prof.setTipoVinculo('N');
        prof.setSalario(45000);
        System.out.println(prof.imprimir());
        
        Aluno alu = new Aluno("Joao", "123123", "123");
        alu.setNota1(8);
        alu.setNota2(4);
        System.out.println(alu.imprimir());
        
    }
}
