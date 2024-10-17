package Aula9_Herança_Polimorfismo.Animal;

public class Animal {
    private String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void fala() {
        System.out.println("Animal falando...");
    }
}
