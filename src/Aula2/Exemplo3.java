package Aula2;

public class Exemplo3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        soma(num1, num2);
        
        int result = somaFunc(num1, num2);
        System.out.println("Resultado Func: "+result);
    }
    // procedimento
    public static void soma(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        
        System.out.println("Resultado Proc: "+resultado);
    }
    
    // Funcao
    public static int somaFunc(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        
        return resultado;
    }
}
