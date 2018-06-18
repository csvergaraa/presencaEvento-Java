/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lacomski
 */
public interface CrudControll {
    
    public ArrayList buscar() throws SQLException, Exception;
   
    public ArrayList buscarNome(String nome) throws SQLException, Exception;
    
    public void excluir() throws SQLException, Exception;
    
    
    
}
