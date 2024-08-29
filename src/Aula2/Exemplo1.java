package Aula2;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Valor 1: ");
        int num1 = scan.nextInt();
        System.out.println("Valor 2: ");
        int num2 = scan.nextInt();
        
        soma(num1, num2);
        
        System.out.println(num1);
    }
    
    public static void soma(int num1, int num2) {
        num1 = 20;
        int result = num1+num2;
        
        System.out.println("Resultado: "+result);
    }
}
