package Aula9_Herança_Polimorfismo.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Animal> lstAnimais = new ArrayList<>();
    static String opt = "";
    
    public static void main(String[] args) {
 
        do {
            System.out.println("========================");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Mostrar todos");
            System.out.println("[3] - Animal falando");
            System.out.println("[4] - Sair");
            System.out.println("========================\n");
            opt = scan.next();
            
            switch (opt) {
                case "1": // Cadastrar
                    cadastrar();
                    break;
                    
                case "2": // Mostrar todos
                    if (lstAnimais.isEmpty()) {
                        System.out.println("Cadastre um animal");
                        continue;
                    }
                    
                    for (Animal animal : lstAnimais) {
                        System.out.println( animal.imprimir());
                    }
                    break;
                    
                case "3": // Animal falando
                    if (lstAnimais.isEmpty()) {
                        System.out.println("Cadastre um animal");
                        continue;
                    }
                    
                    for (Animal animal : lstAnimais) {
                        System.out.println( animal.fala());
                    }
                    break;
                case "4":
                    System.out.println("Obrigado por ter vindo!");
                    break;
                default:
                    System.out.println("## Opção inválida ##");
            }
        } while(!opt.equals("4"));
    }
    
    public static void cadastrar() {
        System.out.println("========================");
        System.out.println("O que deseja cadastrar?");
        System.out.println("[1] - Cachorro");
        System.out.println("[2] - Gato");
        System.out.println("[3] - Capivara");
        System.out.println("========================\n");

        opt = scan.next();

        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("Idade: ");
        int idade = scan.nextInt();

        switch (opt) {
            case "1": // Cachorro
                System.out.print("Velocidade: ");
                int velocidade = scan.nextInt();

                Cachorro dog = new Cachorro(nome, idade, velocidade);
                lstAnimais.add(dog);
                break;
            case "2": // Gato
                System.out.print("Altura: ");
                int alturaSalto = scan.nextInt();

                Gato cat = new Gato(nome, idade, alturaSalto);
                lstAnimais.add(cat);
                break;
            case "3": // Capivara
                System.out.print("Peso: ");
                int peso = scan.nextInt();

                Capivara capi = new Capivara(nome, idade, peso);
                lstAnimais.add(capi);   
                break;
            default:
                System.out.println("## Opção inválida ##");
        }
    }
}
