package vo;

public class AlunoEventoVO extends AlunoVO{
    private String nomeEvento;
    private int horas;
    
    public AlunoEventoVO(){
    
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public int getHoras() {
        return horas;
    }
    
}
