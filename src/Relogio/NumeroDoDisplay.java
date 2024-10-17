package Relogio;

public class NumeroDoDisplay
{
    private int limite;
    private int valor;
    private NumeroDoDisplay dependente;

    public NumeroDoDisplay(int novoLimite)
    {
        limite = novoLimite;
        valor = 0;
    }
    
    public NumeroDoDisplay(int novoLimite, NumeroDoDisplay dependente)
    {
        this(novoLimite);
        this.dependente = dependente;
    }

    public int getValue()
    {
        return valor;
    }

    
    public String getValorDisplay()
    {
        if(valor < 10) {
            return "0" + valor;
        }
        else {
            return "" + valor;
        }
    }

    
    public void setValue(int novoValor)
    {
        if((novoValor >= 0) && (novoValor < limite)) {
            valor = novoValor;
        }
    }

    
    public void incrementa()
    {
        valor = (valor + 1) % limite;
        
        if (valor == 0 && dependente != null) {
            dependente.incrementa();
        }
    }
}
