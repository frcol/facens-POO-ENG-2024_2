package Aula8_Relacionamento;

import java.util.ArrayList;

public class Pessoa
{
    private String nome;
    ArrayList<Endereco> lstEnderecos;
    
    public Pessoa(String nome) {
        this.nome = nome;
        lstEnderecos = new ArrayList<>();
    }
    
    public void addEndereco(Endereco endereco) {
        lstEnderecos.add(endereco);
    }
}

