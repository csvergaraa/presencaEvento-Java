package controller;

import dao.AlunoEventoDAO;
import java.sql.SQLException;
import vo.AlunoVO;
import vo.EventoVO;

public class AlunoEventoControll {
    private AlunoVO alunoVO;
    private EventoVO eventoVO;
    
    public AlunoEventoControll(){
        
    }
    
    public AlunoEventoControll(AlunoVO alunoVO, EventoVO eventoVO){
        this.alunoVO = alunoVO;
        this.eventoVO = eventoVO;
    }
    
    public void cadastrar() throws ClassNotFoundException, SQLException{
        
        AlunoEventoDAO alunoEventoDAO = new AlunoEventoDAO(alunoVO.getIDAluno(), eventoVO.getIDEvento());
        alunoEventoDAO.cadastrar();
    }


    
}
