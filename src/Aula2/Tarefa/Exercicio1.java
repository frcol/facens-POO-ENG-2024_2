package Aula2.Tarefa;

import java.util.Scanner;

/*Exercício 1: Calculadora Simples
Crie uma função que simule uma calculadora simples. 
Ela deve receber dois números e um operador (+, -, *, /) como parâmetros e retornar o 
resultado da operação.
*/
public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Resultado: "+Calcula(2, 5, '+'));
    }

    public static int Calcula(int x, int y, char operador) {
        int resultado = 0;

        switch (operador) {
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                resultado = x / y;
                break;
        }

        return resultado;
    }
}
