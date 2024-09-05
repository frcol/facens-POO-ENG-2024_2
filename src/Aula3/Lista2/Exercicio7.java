package Aula3.Lista2;

/*
Exerc�cio 7: M�dia de uma lista de n�meros
Escreva uma fun��o chamada calculaMedia que receba um array de n�meros inteiros e retorne a m�dia aritm�tica dos n�meros.
Instru��es:
? A fun��o deve percorrer o array e calcular a soma de todos os n�meros.
? A m�dia � obtida dividindo a soma pelo n�mero de elementos no array.
? Entrada: Um array de n�meros inteiros.
? Sa�da: Um n�mero representando a m�dia dos elementos.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        double media = calculaMedia(numeros);
        System.out.println("A m�dia dos n�meros �: " + media);
    }

    public static double calculaMedia(int[] array) {
        if (array.length == 0) {
            return 0; // Evita divis�o por zero se o array estiver vazio
        }

        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return (double) soma / array.length;
    }
}
