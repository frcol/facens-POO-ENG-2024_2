package Aula9_Heran�a_Polimorfismo.Animal;


public class Capivara extends Animal{
    
    public Capivara(String nome) {
        super(nome);
    }

    @Override
    public void fala() {
        System.out.println("Capivara falando....");
    }
    
    
}
