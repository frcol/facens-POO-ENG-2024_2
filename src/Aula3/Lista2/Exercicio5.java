package Aula3.Lista2;

/*
Exerc�cio 5: Fatorial
Escreva uma fun��o chamada calculaFatorial que receba um n�mero inteiro como 
par�metro e retorne o fatorial desse n�mero.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        int numero = 5;
        long resultado = calculaFatorial(numero);
        System.out.println("O fatorial de " + numero + " � " + resultado);
    }

    public static long calculaFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial n�o � definido para n�meros negativos.");
        }

        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
