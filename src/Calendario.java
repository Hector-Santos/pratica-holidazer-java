import java.util.*;

public class Calendario {
    private List<Feriado> Feriados = new ArrayList<>();
    
    public Calendario(Feriado[] feriados){
       for(int i = 0; i < feriados.length; i++)
        this.Feriados.add(feriados[i]);
    }
    public String achaFeriado(String data){
        for(Feriado p : this.Feriados)
            if(p.getData().equals(data))
                return p.getNome();
        
        return "não existe feriado com tal data";
    }
    public List<Feriado> getFeriados(){
        return this.Feriados;
    }
 } 

