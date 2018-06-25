package controller;

import dao.AlunoEventoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
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


    public ArrayList<AlunoVO> buscar(EventoVO eventoVO) throws Exception{
        
        AlunoEventoDAO alunoEventoDAO = new AlunoEventoDAO(0, eventoVO.getIDEvento());
        return alunoEventoDAO.buscar();
    }
}
