package Aula2.Tarefa;

/*
Exerc�cio 4: Convers�o de Temperatura
Crie uma fun��o que converta uma temperatura em graus Celsius para Fahrenheit. 
A fun��o deve receber a temperatura em Celsius como par�metro e retornar a 
temperatura equivalente em Fahrenheit.
F = C * 9/5 + 32.
*/
public class Exercicio4 {
    public static void main(String[] args) {
        System.out.printf("Temperatura: %.2f\n", celsiusParaFahrenheit(36.6));
    }
    
    public static double celsiusParaFahrenheit(double tempCelsius) {
        double resultado = tempCelsius * 9/5 + 32;
        
        return resultado;
    }
}
