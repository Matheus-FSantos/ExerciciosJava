/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.*;
/**
 *
 * @author mfm65
 */
public class Conector {
    public static Connection conectar(){
        try {
            String url = "jdbc:mysql://localhost/projetoswing?useTimezone=true&serverTimezone=UTC";
            String username = "root";
            String password = "vertrigo";
            
            java.sql.Connection conexao = DriverManager.getConnection(url, username, password);
            return conexao;
        } catch (SQLException error) {
            return null;
        }
    }
}