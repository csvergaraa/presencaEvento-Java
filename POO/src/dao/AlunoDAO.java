package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vo.AlunoVO;

public class AlunoDAO implements CrudDAO{
    private Conexao conexao;
    private AlunoVO alunoVO;
    
    public AlunoDAO(){
        conexao = new Conexao();
    }
    
    public AlunoDAO(AlunoVO alunoVO){
        conexao = new Conexao();
        this.alunoVO = alunoVO;
    }
    
    @Override
    public void cadastrar() throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO ALUNO(RA, nome, curso, periodo, turno, email, telefone) "
                + "VALUES (" + alunoVO.getRA() + ",'" + alunoVO.getNome() + "','" 
                + alunoVO.getCurso() + "'," + alunoVO.getPeriodo() + ",'" + alunoVO.getTurno() 
                + "','" + alunoVO.getEmail() +"','" + alunoVO.getTelefone() + "')";

        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();

        sessao.executeUpdate(sql);

        conexao.desconectar();
    }
    
    @Override
    public void editar()throws SQLException, Exception{
           
        String sql = "UPDATE ALUNO SET nome = '" 
                + alunoVO.getNome() + "', curso = '" + alunoVO.getCurso()
                + "', periodo = " + alunoVO.getPeriodo() + ", turno = '" + alunoVO.getTurno()
                + "', email = '" + alunoVO.getEmail() + "', telefone = '" + alunoVO.getTelefone()
                + "' WHERE ALUNO.RA = " + alunoVO.getRA();

        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();

        sessao.executeUpdate(sql);

        conexao.desconectar();
    }

    @Override
    public ArrayList<AlunoVO> buscar() throws SQLException, Exception{
        
        ArrayList<AlunoVO> alunos = new ArrayList<>();
        String sql = "SELECT * FROM ALUNO";
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet rs = sessao.executeQuery(sql);
        
        while(rs.next()) {
            
            AlunoVO alunoVO = new AlunoVO();
            
            alunoVO.setIDAluno(rs.getInt("IDAluno"));
            alunoVO.setRA(rs.getInt("ra"));
            alunoVO.setNome(rs.getString("nome"));
            alunoVO.setCurso(rs.getString("curso"));
            alunoVO.setPeriodo(rs.getInt("periodo"));
            alunoVO.setTurno(rs.getString("turno"));
            alunoVO.setEmail(rs.getString("email"));
            alunoVO.setTelefone(rs.getString("telefone"));
            alunos.add(alunoVO);
        }
        
        conexao.desconectar();
   
        return alunos;        
    }
    
    
    @Override
    public ArrayList<AlunoVO> buscarNome() throws SQLException, Exception{
     
        ArrayList<AlunoVO> alunos = new ArrayList<>();
        String sql = "SELECT * FROM ALUNO WHERE ALUNO.nome like '%" + alunoVO.getNome() + "%'";
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet rs = sessao.executeQuery(sql);
        
        while(rs.next()) {
            
            AlunoVO alunoVO = new AlunoVO();
            
            alunoVO.setIDAluno(rs.getInt("IDAluno"));
            alunoVO.setRA(rs.getInt("ra"));
            alunoVO.setNome(rs.getString("nome"));
            alunoVO.setCurso(rs.getString("curso"));
            alunoVO.setPeriodo(rs.getInt("periodo"));
            alunoVO.setTurno(rs.getString("turno"));
            alunoVO.setEmail(rs.getString("email"));
            alunoVO.setTelefone(rs.getString("telefone"));
            alunos.add(alunoVO);
        }
        
        conexao.desconectar();
   
        return alunos;   
    }
    
     public AlunoVO buscarRA() throws SQLException, Exception{
     
        String sql = "SELECT * FROM ALUNO WHERE ALUNO.ra = " + alunoVO.getRA() + ";";
      
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        AlunoVO alunoVO = new AlunoVO();        
        ResultSet rs = sessao.executeQuery(sql);        
        if(rs.next()){
            alunoVO.setIDAluno(rs.getInt("IDAluno"));
            alunoVO.setRA(rs.getInt("ra"));
            alunoVO.setNome(rs.getString("nome"));
            alunoVO.setEmail(rs.getString("email"));
        }
        conexao.desconectar();
//   
        return alunoVO;   
    }
    @Override
     public void excluir() throws SQLException, Exception {
        String sql = "DELETE FROM ALUNO WHERE ALUNO.ra = " + alunoVO.getRA() + ";";
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        sessao.execute(sql);
        conexao.desconectar();
    }
    
}
