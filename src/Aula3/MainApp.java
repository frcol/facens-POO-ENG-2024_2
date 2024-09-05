package Aula3;

import java.util.Scanner;

public class MainApp {
    static Scanner scan = new Scanner(System.in);
    static Aluno aluno = new Aluno();
    
    public static void main(String[] args) {     
        String opt = "";

        do {
            System.out.println("\n================");
            System.out.println("1- Cadastrar Aluno \n2- Mostrar aluno \n3- Sair");
            opt = scan.next();

            switch (opt) {
                case "1": // cadastrar
                    cadastrar();
                    break;
                case "2":
                    System.out.println(aluno.print());
                    break;
                case "3":
                    System.out.println("Volte sempre");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (!opt.equals("3"));

    }
    
    public static void cadastrar() {
        String ra;
        String nome;
        String curso;
        
        System.out.println("Ra:");
        ra = scan.next();
        System.out.println("Nome:");
        nome = scan.next();
        System.out.println("Curso:");
        curso = scan.next();

        aluno.setRa(ra);
        aluno.setNome(nome);
        aluno.setCurso(curso);
    }
}
