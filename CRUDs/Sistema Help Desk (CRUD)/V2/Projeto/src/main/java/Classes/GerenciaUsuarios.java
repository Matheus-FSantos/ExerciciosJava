/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Conexao.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mfm65
 */
public class GerenciaUsuarios {
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
    
    public static boolean verificaUsuario(String nome){
        try {
            String sqlQuery = "SELECT * FROM usuarios WHERE usuarios.usuario = ?";
        
            PreparedStatement pst = Conector.conectar().prepareStatement(sqlQuery);   
            pst.setString(1, nome);
            
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
    
    public static void capturaTodosUsuarios(JTable tabela){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        try {
            String sqlQuery = "SELECT chamados.id, chamados.numeroMaquina, upper(chamados.nomeUsuario) as nomeUsuario, chamados.descricao, date_format(chamados.dataChamado, \"%d/%m/%Y\") as dataChamado FROM chamados";
            
            PreparedStatement pst = Conector.conectar().prepareStatement(sqlQuery);
            ResultSet resultado = pst.executeQuery();
            
            modelo.setNumRows(0);
            while(resultado.next()){
                Object dados[] = {resultado.getString("id"), resultado.getString("numeroMaquina"), resultado.getString("nomeUsuario"), resultado.getString("descricao"), resultado.getString("dataChamado")};
                modelo.addRow(dados);
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        } 
    }

    public static void capturaDados(JTable tabela, String nome) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        try {
            String sqlQuery = "SELECT chamados.id, chamados.numeroMaquina, upper(chamados.nomeUsuario) as nomeUsuario, chamados.descricao, date_format(chamados.dataChamado, \"%d/%m/%Y\") as dataChamado FROM chamados WHERE nomeUsuario = ?";
            
            PreparedStatement pst = Conector.conectar().prepareStatement(sqlQuery);
            pst.setString(1, nome);
            ResultSet resultado = pst.executeQuery();
            
            modelo.setNumRows(0);
            while(resultado.next()){
                Object dados[] = {resultado.getString("id"), resultado.getString("numeroMaquina"), "Você", resultado.getString("descricao"), resultado.getString("dataChamado")};
                modelo.addRow(dados);
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        } 
    }
}