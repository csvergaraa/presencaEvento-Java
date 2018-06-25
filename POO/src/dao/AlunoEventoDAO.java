package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import vo.AlunoEventoVO;
import vo.AlunoVO;


public class AlunoEventoDAO{
    private Conexao conexao;
    private int IDEvento;
    private int IDAluno;
    private ArrayList<AlunoEventoVO> alunoEventos;
    
    public AlunoEventoDAO(){
        conexao = new Conexao();
    }
    
    public AlunoEventoDAO(int IDAluno, int IDEvento){
        conexao = new Conexao();
        this.IDAluno = IDAluno;
        this.IDEvento = IDEvento;
    }
    
    public AlunoEventoDAO(ArrayList<AlunoEventoVO> alunoEventos) {
        conexao = new Conexao();
        this.alunoEventos = alunoEventos;
    }

    
    public void cadastrar() throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO EventoAluno(IDAluno, IDEvento) "
                + "VALUES (" + this.IDAluno + ", " + this.IDEvento + ")";

        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();

        sessao.executeUpdate(sql);

        conexao.desconectar();
    }
    
    public ArrayList<AlunoVO> buscar() throws SQLException, Exception{
        
        ArrayList<AlunoVO> alunos = new ArrayList<>();
        String sql = "SELECT * FROM ALUNO, EventoAluno where EventoAluno.IDEvento = " + this.IDEvento + " and ALUNO.IDAluno = EventoAluno.IDAluno;";
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet rs = sessao.executeQuery(sql);
        
        while(rs.next()) {
            
            AlunoVO alunoVO = new AlunoVO();
            
            alunoVO.setIDAluno(rs.getInt("IDAluno"));
            alunoVO.setRA(rs.getInt("ra"));
            alunoVO.setNome(rs.getString("nome"));
            alunoVO.setCurso(rs.getString("curso"));
            alunoVO.setEmail(rs.getString("email"));
            alunos.add(alunoVO);
        }
        
        conexao.desconectar();
   
        return alunos;       
    }
    
    public ArrayList<AlunoEventoVO> buscarRelatorio() throws SQLException, Exception{
    
        ArrayList<AlunoEventoVO> alunoEventos = new ArrayList<>();
        String sql = "SELECT ALUNO.ra as RA, ALUNO.nome as Nome, ALUNO.curso as Curso, ALUNO.periodo \n" +
                     "as Periodo, ALUNO.turno as Turno, ALUNO.email as Email, EVENTO.nome as Evento, \n" +
                     "EVENTO.horas as Horas FROM EVENTO, ALUNO, EventoAluno where \n" +
                     "EventoAluno.IDEvento = EVENTO.IDEvento and ALUNO.IDAluno = EventoAluno.IDAluno order by Nome;";
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet rs = sessao.executeQuery(sql);
        
        while(rs.next()) {
            
            AlunoEventoVO alunoEventoVO = new AlunoEventoVO();
            
            alunoEventoVO.setRA(rs.getInt("RA"));
            alunoEventoVO.setNome(rs.getString("Nome"));
            alunoEventoVO.setCurso(rs.getString("Curso"));
            alunoEventoVO.setPeriodo(rs.getInt("Periodo"));
            alunoEventoVO.setTurno(rs.getString("Turno"));
            alunoEventoVO.setEmail(rs.getString("Email"));
            alunoEventoVO.setNomeEvento(rs.getString("Evento"));
            alunoEventoVO.setHoras(rs.getInt("Horas"));
            
            alunoEventos.add(alunoEventoVO);
        }
        
        conexao.desconectar();
   
        return alunoEventos;       
    }
    
    
    public boolean verificarExistencia(String nomeArquivo) throws IOException, SQLException, Exception {
        
        File arquivo = new File(nomeArquivo);
        return arquivo.exists();        
    }
    
    public void gerarRelatorio(String nomeArquivo) throws IOException, SQLException, Exception {
        
        String linha;
        String texto;

        BufferedWriter documento = new BufferedWriter(new FileWriter(nomeArquivo));
        
        String header = "RA \t Nome \t Curso \t Periodo \t Turno \t Email \t Evento \t Horas";
        StringTokenizer sr = new StringTokenizer(header, "\n");
        sr.hasMoreTokens();        
        linha = sr.nextToken();

        documento.write(linha);
        documento.newLine();       
        
        for (int i = 0; i < this.alunoEventos.size(); i++) {

            AlunoEventoVO alunoEvento = alunoEventos.get(i);
            
            texto = alunoEvento.getRA() + "\t" + alunoEvento.getNome() + "\t" + alunoEvento.getCurso() 
                    + "\t" + alunoEvento.getPeriodo() + "\t" + alunoEvento.getTurno() 
                    + "\t" + alunoEvento.getEmail() + "\t" + alunoEvento.getNomeEvento() + "\t" + alunoEvento.getHoras();
            
            StringTokenizer st = new StringTokenizer(texto, "\n");

            while (st.hasMoreTokens()) {

                linha = st.nextToken();

                documento.write(linha);
                documento.newLine();
            }
        }

        documento.close();
    }    
}
