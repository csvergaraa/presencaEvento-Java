package vo;

public class EventoVO {
    private int IDEvento;
    private int horas;
    private String nome;
    private String tipoEvento;
    private String data;
    private String horaInicial;
    private String horaFinal;
    
    public EventoVO(){
    
    }
    
    public EventoVO(String nome, String tipoEvento, String data, String horaInicial, String horaFinal){
        this.nome = nome;
        this.data = data;
        this.tipoEvento = tipoEvento;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public void setIDEvento(int IDEvento) {
        this.IDEvento = IDEvento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getData() {
        return data;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public int getIDEvento() {
        return IDEvento;
    }

    public int getHoras() {
        return horas;
    }
    
}
