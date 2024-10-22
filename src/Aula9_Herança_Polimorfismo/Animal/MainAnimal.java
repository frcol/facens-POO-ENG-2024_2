package Aula9_Heran�a_Polimorfismo.Animal;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro("Xod�");
        //dog1.fala();
        
        Capivara capivara = new Capivara("Chica");
        //capivara.fala();
        
        ArrayList<Animal> lstAnimais = new ArrayList<>();
        lstAnimais.add(dog1);
        lstAnimais.add(capivara);
        
        for (Animal animal : lstAnimais) {
            animal.fala();
        }
               
    }
}
