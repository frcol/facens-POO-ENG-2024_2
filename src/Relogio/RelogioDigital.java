package Relogio;

import java.util.Timer;
import java.util.TimerTask;

public class RelogioDigital
{
    // TIMER =============================
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            TempoCorreUmSegundo();
        }
    };
    // ===================================
    
    private NumeroDoDisplay horas;
    private NumeroDoDisplay minutos;
    private NumeroDoDisplay segundos;
  
    
    public RelogioDigital()
    {
        horas = new NumeroDoDisplay(24);
        minutos = new NumeroDoDisplay(60, horas);
        segundos = new NumeroDoDisplay(60, minutos);
    }

    
    public RelogioDigital(int hora, int minuto)
    {
        this();
        
        setTime(hora, minuto);
    }

    
    public void TempoCorreUmMinuto()
    {
        minutos.incrementa();
        System.out.println(getTimeDisplay());
    }

    public void TempoCorreUmSegundo()
    {
        segundos.incrementa();
        System.out.println(getTimeDisplay());
    }
    
    public void setTime(int hora, int minuto)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
    }

    
    public String getTimeDisplay()
    {
        return horas.getValorDisplay() + ":" + 
               minutos.getValorDisplay() + ":" + 
               segundos.getValorDisplay();
    }
    
    public void start() {
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
