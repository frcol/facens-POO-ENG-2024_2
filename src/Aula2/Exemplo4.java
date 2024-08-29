package Aula2;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name: ");
        String first = scan.nextLine();
        
        System.out.println("Last Name: ");
        String last = scan.nextLine();
        
        String complete = completeName(first, last);
        System.out.println("Nome completo: "+complete);
    }
    
    public static String completeName(String first, String last) {
        String complete = first +" "+ last;
        
        return complete;
    }
}
