package controller;

import dao.EventoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import vo.EventoVO;

public class EventoControll implements CrudControll{
    private EventoVO eventoVO;
    
    public EventoControll(){
        
    }
    
    public EventoControll(EventoVO eventoVO){
        this.eventoVO = eventoVO;
    }
    
    public void cadastrarEvento(String nome, String tipoEvento, String data, String horaInicial, String horaFinal, String horas) throws ClassNotFoundException, SQLException, ValidacaoException{
        this.validarCampos(nome, tipoEvento, data, horaInicial, horaFinal, horas);

        EventoVO eventoVO = new EventoVO();

        eventoVO.setNome(nome);
        eventoVO.setTipoEvento(tipoEvento);
        eventoVO.setData(data);
        eventoVO.setHoraInicial(horaInicial);
        eventoVO.setHoraFinal(horaFinal);
        eventoVO.setHoras(Integer.parseInt(horas));
        
        EventoDAO eventoDao = new EventoDAO(eventoVO);
        eventoDao.cadastrar();
    }
    
    public void editar(String nome, String data, String horaInicial, String horaFinal, String tipoEvento, String horas) throws ValidacaoException, SQLException, Exception {

        this.validarCampos(nome, tipoEvento, data, horaInicial, horaFinal, horas);

        EventoVO eventoVO = new EventoVO();

        eventoVO.setNome(nome);
        eventoVO.setTipoEvento(tipoEvento);
        eventoVO.setData(data);
        eventoVO.setHoraInicial(horaInicial);
        eventoVO.setHoraFinal(horaFinal);
        eventoVO.setHoras(Integer.parseInt(horas));
        
        EventoDAO eventoDAO = new EventoDAO(eventoVO);
        eventoDAO.editar();
    }

    @Override
    public void excluir() throws SQLException, Exception {

        EventoDAO eventoPers = new EventoDAO(this.eventoVO);
        eventoPers.excluir();
    }
    
    @Override
     public ArrayList<EventoVO> buscar() throws SQLException, Exception {

        EventoDAO eventoDao = new EventoDAO();
        return eventoDao.buscar();
    }
    
    
    
    @Override
    public ArrayList<EventoVO> buscarNome(String nome) throws SQLException, Exception {
        
        EventoVO eventoVO = new EventoVO();
        eventoVO.setNome(nome);
        
        EventoDAO eventoDAO = new EventoDAO(eventoVO);
        return eventoDAO.buscarNome();
    }
 
    public void validarCampos(String nome, String tipoEvento, String data, String horaInicial, String horaFinal, String horas) throws ValidacaoException{
        
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
        } else if (Integer.parseInt(horas) <= 0){
            throw new ValidacaoException("Campo horas deve ser maior que Zero!");
        }
    }

    
}
 
    