package vo;

public class AlunoVO {
    private int IDAluno;
    private int RA;
    private String nome;
    private String curso;
    private int periodo;
    private String email;
    private String telefone;
    private String turno;
    
    public AlunoVO(){
        
    }
    
    public AlunoVO(int RA, int periodo, String nome, String curso, String turno, String email, String telefone){
        this.RA = RA;
        this.periodo = periodo;
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
        this.email = email;
        this.telefone = telefone;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setIDAluno(int IDAluno) {
        this.IDAluno = IDAluno;
    }
    
    public int getRA() {
        return RA;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTurno() {
        return turno;
    }  

    public int getIDAluno() {
        return IDAluno;
    }
    
}
