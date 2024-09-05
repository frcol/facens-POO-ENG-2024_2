package Aula3.Lista2;

/*
Exerc�cio 3: Contagem de Caracteres
Desenvolva uma fun��o que conte quantas vezes um determinado caractere aparece 
em uma string. A fun��o deve receber a string e o caractere como par�metros e 
retornar a contagem.
Lembre-se de que voc� pode usar o m�todo charAt() para acessar caracteres 
individuais em uma string.
*/
public class Exercicio3 {
    public static void main(String[] args) {
        int result =  contarCaractere("Antonio", 'o');
        System.out.println(result);
    }
    
    public static int contarCaractere(String texto, char caracter) {
        int contagem = 0;
        
        for (int i=0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contagem++;
            }
        }
        
        return contagem;
    }
}
