package Aula9_Herança_Polimorfismo.Animal;

public class Cachorro extends Animal {
    
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fala() {
        //super.fala();
        
        System.out.println("Auauauauauauaua");
    }

    public void correr() {
        System.out.println("Estou correndo...");
    }
    
    
}
