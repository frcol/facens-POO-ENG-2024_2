package Aula9_Heran�a_Polimorfismo.Animal;

public class Cachorro extends Animal {
    
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fala() {
        System.out.println("Auauauauauauaua");
    }

    
    
    
}
