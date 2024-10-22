package Aula9_Herança_Polimorfismo.Animal;


public class Capivara extends Animal{
    
    public Capivara(String nome) {
        super(nome);
    }

    @Override
    public void fala() {
        System.out.println("Capivara falando....");
    }
    
    
}
