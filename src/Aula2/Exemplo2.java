package Aula2;

public class Exemplo2 {
    public static void main(String[] args) {
        int numeros[] = {1,2,3};
        
        System.out.println("antes de chamar o procedimento: "+numeros[1]);
        soma(numeros);
        System.out.println("depois de chamar: "+numeros[1]);
    }
    
    public static void soma(int[] valores) {
        valores[1] = 100;
    }
}
