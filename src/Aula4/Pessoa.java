package Aula4;

public class Pessoa {
    private String cpf;
    private String nome;
    private String carteiraMotorista;

    // construtor
    public Pessoa() {
        
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    } 
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // gets and sets
    public String getCarteiraMotorista() {
        return this.carteiraMotorista;
    }
    
    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
    
    // Metodos Helpers
    public String imprimir() {
        String msg = "\nNome: "+nome+
                    "\nCPF: "+cpf+
                    "\nCNH: "+carteiraMotorista;
        System.out.println(msg);
        
        return msg;
    }
}
