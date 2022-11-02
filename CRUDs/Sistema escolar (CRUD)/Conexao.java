package br.com.crud.connector;
import java.sql.*;

public class Conexao {
    public static Connection conectar(){
        try {
            String url = "jdbc:mysql://localhost/curso_db?useTimezone=true&serverTimezone=UTC";
            String username = "root";
            String password = "vertrigo";
            
            java.sql.Connection conexao = DriverManager.getConnection(url, username, password);
            return conexao;
        } catch (SQLException error) {
            return null;
        }
    }
}