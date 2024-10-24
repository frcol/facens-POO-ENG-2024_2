package Aula9_Herança_Polimorfismo.Animal;

public class Gato extends Animal {
    private int alturaSalto;

    public Gato() {
    }

    public Gato(String nome, int idade, int alturaSalto) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    @Override
    public String fala() {
        return "Miau miau miau";
    }

    @Override
    public String imprimir() {
        return super.imprimir()
                +"\nAltura salto: "+alturaSalto;
    }
    
    
}
