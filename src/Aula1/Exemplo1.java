package Aula1;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        //int idade = 10;
        //float valor = 11.5f;
        //double saldo = 101.33;
        //char sexo = 'm';
        //boolean ativo = true;
        
        //String nome = "Fabio Colombini";
        
        // Entrada de dados do usuário
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva o seu nome:");
        String nome = scan.nextLine();
        
        System.out.println("Idade:");
        int idade = scan.nextInt();
        
        System.out.println("Ativo?");
        boolean ativo = scan.nextBoolean();
        
        System.out.println("Nome: "+nome
                            +"\nIdade: "+idade
                            +"\nAtivo: "+ativo);
    }
}
