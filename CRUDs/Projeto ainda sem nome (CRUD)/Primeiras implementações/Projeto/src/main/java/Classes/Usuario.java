/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import Conexao.*;
import java.sql.*;
/**
 *
 * @author mfm65
 */
public class Usuario {
    public static boolean inserir(String nome, String senha, String email){
        try {
            String sqlQuery = "INSERT INTO usuarios VALUES (?, ?, ?, ?)";
            
            PreparedStatement pst = Conector.conectar().prepareStatement(sqlQuery);
            
            pst.setString(1, "0");
            pst.setString(2, nome);
            pst.setString(3, senha);
            pst.setString(4, email);
            
            pst.executeUpdate();
            
            return true;
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
            return false;
        }
    }
    
    public static boolean verificaUsuario(String nome, String senha){
        try {
            String sqlQuery = "SELECT * FROM usuarios WHERE usuarios.usuario = ? and usuarios.senha = ?";
        
            PreparedStatement pst = Conector.conectar().prepareStatement(sqlQuery);   
            pst.setString(1, nome);
            pst.setString(2, senha);
            
            ResultSet resultado = pst.executeQuery();
            
            if(resultado.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
            return false;
        }
    }
}