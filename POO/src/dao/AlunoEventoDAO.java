package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class AlunoEventoDAO {
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
    
}
