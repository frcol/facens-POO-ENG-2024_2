package Aula9_Herança_Polimorfismo.Animal;


public class Capivara extends Animal{
    private int peso;

    public Capivara() {
    }

    public Capivara(String nome, int peso, int idade) {
        super(nome, idade);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String fala() {
        return "Capicara falando....";
    }

    @Override
    public String imprimir() {
        return super.imprimir()
                +"\nPeso: "+peso;
    }
}
