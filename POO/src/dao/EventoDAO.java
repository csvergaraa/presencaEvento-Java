package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vo.EventoVO;

public class EventoDAO implements CrudDAO{
    private Conexao conexao;
    private EventoVO eventoVO;
    
    public EventoDAO(){
        conexao = new Conexao();
    }
    
    public EventoDAO(EventoVO eventoVO){
        conexao = new Conexao();
        this.eventoVO = eventoVO;
    }
    
    @Override
    public void cadastrar() throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO EVENTO(nome, tipo, data, horaInicial, horaFinal) "
                + "VALUES ('" + eventoVO.getNome() + "','" + eventoVO.getTipoEvento() + "','" 
                + eventoVO.getData() + "','" + eventoVO.getHoraInicial() + "','" + eventoVO.getHoraFinal() + "');";
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();

        sessao.executeUpdate(sql);

        conexao.desconectar();
    }
    
    @Override
    public void editar()throws SQLException, Exception{
           
        String sql = "UPDATE EVENTO "
                + "SET nome = '" + eventoVO.getNome() + "', tipoEvento = '" + eventoVO.getTipoEvento()
                + "', data = " + eventoVO.getData() + ", horaInicial = '" + eventoVO.getHoraInicial()
                + "', horaFinal = '" + eventoVO.getHoraFinal()
                + "' WHERE ALUNO.RA = " + eventoVO.getNome();

        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();

        sessao.executeUpdate(sql);

        conexao.desconectar();
    }

    @Override
    public ArrayList buscar() throws SQLException, Exception {
       
        ArrayList<EventoVO> eventos = new ArrayList<>();
        String sql = "SELECT * FROM EVENTO";

        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();

        ResultSet rs = sessao.executeQuery(sql);
        
        while (rs.next()) {

            EventoVO eventoVO = new EventoVO();

            eventoVO.setNome(rs.getString("nome"));
            eventoVO.setData(rs.getString("data"));
            eventoVO.setHoraInicial(rs.getString("horaInicial"));
            eventoVO.setHoraFinal(rs.getString("horaFinal"));
            eventoVO.setTipoEvento(rs.getString("tipo"));
    
            eventos.add(eventoVO);
        }

        conexao.desconectar();
        
        return eventos;
    }

    
    
    @Override
    public ArrayList<EventoVO> buscarNome() throws SQLException, Exception{
     
        ArrayList<EventoVO> eventos = new ArrayList<>();
        String sql = "SELECT * FROM EVENTO WHERE EVENTO.nome like '%" + eventoVO.getNome() + "%'";
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet rs = sessao.executeQuery(sql);
        
        while(rs.next()) {
            
            EventoVO eventoVO = new EventoVO();
            
            eventoVO.setNome(rs.getString("nome"));
            eventoVO.setData(rs.getString("data"));
            eventoVO.setHoraInicial(rs.getString("horaInicial"));
            eventoVO.setHoraFinal(rs.getString("horaFinal"));
            eventoVO.setTipoEvento(rs.getString("tipo"));
        
            eventos.add(eventoVO);
        }
        
        conexao.desconectar();
   
        return eventos;   
    }
    
    
    @Override
     public void excluir() throws SQLException, Exception {
        String sql = "DELETE FROM EVENTO WHERE EVENTO.nome = '" + eventoVO.getNome() + "';";
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        sessao.executeUpdate(sql);
        conexao.desconectar();
    }
    
}
