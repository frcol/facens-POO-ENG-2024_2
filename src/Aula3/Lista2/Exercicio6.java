package Aula3.Lista2;

/*
Exerc�cio 6: N�mero primo
Escreva uma fun��o chamada ehPrimo que receba um n�mero inteiro como par�metro e 
retorne true se o n�mero for primo e false caso contr�rio.
Instru��es:
Um n�mero primo � divis�vel apenas por 1 e por ele mesmo.
Entrada: Um n�mero inteiro.
Sa�da: Um valor booleano indicando se o n�mero � primo ou n�o..
 */
public class Exercicio6 {
    public static void main(String[] args) {
        float num = 37;
        System.out.println("� primo: "+ehPrimo(num));
    }
    
    public static boolean ehPrimo(float num) {
        if (num <= 1) {
            return false; // N�meros menores ou iguais a 1 n�o s�o primos
        }
        
        for (int i = 2; i < num;i++) {
            float result = num % i;
            if (result == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
