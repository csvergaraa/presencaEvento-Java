package controller;

import dao.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import vo.AlunoVO;

public class AlunoControll implements CrudControll{
    private AlunoVO alunoVO;
    
    public AlunoControll(){
        
    }
    
    public AlunoControll(AlunoVO alunoVO){
        this.alunoVO = alunoVO;
    }
    
    public void cadastrar(String RA, String nome, String curso, String periodo, String turno, String email, String telefone) throws ClassNotFoundException, SQLException, ValidacaoException{
        this.validarCampos(RA, nome, curso, periodo, turno, email, telefone);

        AlunoVO alunoVO = new AlunoVO();

        alunoVO.setRA(Integer.parseInt(RA));
        alunoVO.setNome(nome);
        alunoVO.setCurso(curso);
        alunoVO.setPeriodo(Integer.parseInt(periodo));
        alunoVO.setTurno(turno);
        alunoVO.setEmail(email);
        alunoVO.setTelefone(telefone);

        AlunoDAO alunoDao = new AlunoDAO(alunoVO);
        alunoDao.cadastrar();
    }
    
    public void editar(String RA, String nome, String curso, String periodo, String turno, String email, String telefone) throws ValidacaoException, SQLException, Exception {

        this.validarCampos(RA, nome, curso, periodo, turno, email, telefone);

        AlunoVO alunoVO = new AlunoVO();

        alunoVO.setRA(Integer.parseInt(RA));
        alunoVO.setNome(nome);
        alunoVO.setCurso(curso);
        alunoVO.setPeriodo(Integer.parseInt(periodo));
        alunoVO.setTurno(turno);
        alunoVO.setEmail(email);
        alunoVO.setTelefone(telefone);
        
        AlunoDAO alunoDao = new AlunoDAO(alunoVO);
        alunoDao.editar();
    }

    
    @Override
    public void excluir() throws SQLException, Exception {

        AlunoDAO alunoPers = new AlunoDAO(this.alunoVO);
        alunoPers.excluir();
    }
    
    @Override
    public ArrayList<AlunoVO> buscarNome(String nome) throws SQLException, Exception {
        
        AlunoVO alunoVO = new AlunoVO();
        alunoVO.setNome(nome);
        
        AlunoDAO alunoDAO = new AlunoDAO(alunoVO);
        return alunoDAO.buscarNome();
    }
 
     public AlunoVO buscarRA(String RA) throws SQLException, Exception {
        
        AlunoVO alunoVO = new AlunoVO();
        alunoVO.setRA(Integer.parseInt(RA));
        AlunoDAO alunoDAO = new AlunoDAO(alunoVO);
        
        return alunoDAO.buscarRA();
    }
    
    @Override
    public ArrayList<AlunoVO> buscar() throws SQLException, Exception {

        AlunoDAO alunoDao = new AlunoDAO();
        return alunoDao.buscar();
    }
    
    public void validarCampos(String RA, String nome, String curso, String periodo, String turno, String email, String telefone) throws ValidacaoException{
        
        if (RA.equals("")) {
            throw new ValidacaoException("Campo RA é obrigatório!");
        } else if (nome.equals("")) {
            throw new ValidacaoException(("Campo Nome é obrigatório!"));
        } else if (Integer.parseInt(periodo) <= 0) {
            throw new ValidacaoException("O Período deve ser um número maior ou igual a 1!");
        } else if (curso.equals("")) {
            throw new ValidacaoException("Campo Curso é obrigatório!");
        } else if (turno.equals("")) {
            throw new ValidacaoException("Campo Turno é obrigatório!");
        } else if (email.equals("")){
            throw new ValidacaoException("Campo E-mail é obrigatório!");
        } else if (telefone.equals("")){
            throw new ValidacaoException("Campo Telefone é obrigatório");
        }
    }
}
 
    