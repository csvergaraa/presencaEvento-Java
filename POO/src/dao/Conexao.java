package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection con;
    private final String driver;
    private final String usuario;
    private final String senha;
    private final String url;

    public Conexao() {

        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/POO";
        usuario = "root";
        senha = "1234";
    }

    public Connection conectar() throws ClassNotFoundException, SQLException {

        con = null;

        Class.forName(driver);
        con = DriverManager.getConnection(url, usuario, senha);
        
        return con;
    }

    public void desconectar() throws SQLException {

//        con = null;
        con.close();
    }
}
