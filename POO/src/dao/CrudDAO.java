package dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO {
    
    public void cadastrar() throws SQLException, Exception;

    public ArrayList buscar() throws SQLException, Exception;
    
    public ArrayList buscarNome() throws SQLException, Exception;

    public void editar() throws SQLException, Exception;

    public void excluir() throws SQLException, Exception;
}
