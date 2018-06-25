package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vo.AlunoVO;


public class AlunoEventoDAO{
    private Conexao conexao;
    private int IDEvento;
    private int IDAluno;
    
    public AlunoEventoDAO(){
        conexao = new Conexao();
    }
    
    public AlunoEventoDAO(int IDAluno, int IDEvento){
        conexao = new Conexao();
        this.IDAluno = IDAluno;
        this.IDEvento = IDEvento;
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
    
}
