package controller;

import dao.AlunoDAO;
import dao.EventoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import vo.AlunoVO;
import vo.EventoVO;

public class EventoControll {
    private EventoVO eventoVO;
    
    public EventoControll(){
        
    }
    
    public EventoControll(EventoVO eventoVO){
        this.eventoVO = eventoVO;
    }
    
    public void cadastrarEvento(String nome, String tipoEvento, String data, String horaInicial, String horaFinal) throws ClassNotFoundException, SQLException, ValidacaoException{
        this.validarCampos(nome, tipoEvento, data, horaInicial, horaFinal);

        EventoVO eventoVO = new EventoVO();

        eventoVO.setNome(nome);
        eventoVO.setTipoEvento(tipoEvento);
        eventoVO.setData(data);
        eventoVO.setHoraInicial(horaInicial);
        eventoVO.setHoraFinal(horaFinal);
        
        EventoDAO eventoDao = new EventoDAO(eventoVO);
        eventoDao.cadastrarEvento();
    }
    
    public void editarAluno(String nome, String tipoEvento, String data, String horaInicial, String horaFinal) throws ValidacaoException, SQLException, Exception {

        this.validarCampos(nome, tipoEvento, data, horaInicial, horaFinal);

        EventoVO eventoVO = new EventoVO();

        eventoVO.setNome(nome);
        eventoVO.setTipoEvento(tipoEvento);
        eventoVO.setData(data);
        eventoVO.setHoraInicial(horaInicial);
        eventoVO.setHoraFinal(horaFinal);
        
        EventoDAO eventoDao = new EventoDAO(eventoVO);
        eventoDao.editarEvento();
    }

    public void excluirEvento() throws SQLException, Exception {

        EventoDAO eventoPers = new EventoDAO(this.eventoVO);
        eventoPers.excluirEvento();
    }
    
     public ArrayList<EventoVO> buscar() throws SQLException, Exception {

        EventoDAO eventoDao = new EventoDAO();
        return eventoDao.buscar();
    }
    
    
    
    public ArrayList<EventoVO> buscarEvento(String nome) throws SQLException, Exception {
        
        EventoVO eventoVO = new EventoVO();
        eventoVO.setNome(nome);
        
        EventoDAO eventoDAO = new EventoDAO(eventoVO);
        return eventoDAO.buscarEvento();
    }
 
    public void validarCampos(String nome, String tipoEvento, String data, String horaInicial, String horaFinal) throws ValidacaoException{
        
        if (nome.equals("")) {
            throw new ValidacaoException(("Campo Nome é obrigatório!"));
        } else if (tipoEvento.equals("")) {
            throw new ValidacaoException("Campo Tipo de Evento é obrigatório!");
        } else if (data.equals("")) {
            throw new ValidacaoException("Campo Data é obrigatório!");
        } else if (horaInicial.equals("")){
            throw new ValidacaoException("Campo Hora Inicial é obrigatório!");
        } else if (horaFinal.equals("")){
            throw new ValidacaoException("Campo Hora Final é obrigatório");
        }
    }

    
}
 
    