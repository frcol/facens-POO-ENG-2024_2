package Aula3.Lista2;
/*
Exerc�cio 2: Verifica��o de N�mero Par
Crie uma fun��o que receba um n�mero inteiro como par�metro e retorne verdadeiro se 
o n�mero for par, ou falso caso contr�rio.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        if (ehPar(2)) {
            System.out.println("O n�mero � par");
        }
    }
    
    public static boolean ehPar(int numero) {
        boolean result = numero % 2 == 0;
        
        return result;
    }
}
