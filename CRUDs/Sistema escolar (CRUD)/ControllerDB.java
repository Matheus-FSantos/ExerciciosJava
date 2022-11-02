package br.com.crud.connector;
import javax.swing.JOptionPane;
import java.sql.*;

public class ControllerDB {
    
    public static void inserir(String nome, String matricula){
        try {
            String sqlQuery = "INSERT INTO alunos VALUES (?, ?, ?)";
            
            PreparedStatement pst = Conexao.conectar().prepareStatement(sqlQuery);
            
            
            pst.setString(1, "0");
            pst.setString(2, nome);
            pst.setString(3, matricula);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Realizado com sucesso!", "Registro salvo!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        }
    }
    public static void alterar(String id, String nome, String matricula){
        try {
            String sqlQuery = "UPDATE alunos SET nome = ?, matricula = ? WHERE id = " + id;
            
            PreparedStatement pst = Conexao.conectar().prepareStatement(sqlQuery);
            
            pst.setString(1, nome);
            pst.setString(2, matricula);
            
            int resultado = pst.executeUpdate();
            
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro Alterado com sucesso!", "Registro alterado!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum Registro Alterado", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error);
        }
    }
    
    public static void buscar(String id){
        try {
            String sqlQuery = "SELECT * FROM alunos WHERE id = ?";
        
            PreparedStatement pst = Conexao.conectar().prepareStatement(sqlQuery);   
            pst.setString(1, id);
            
            ResultSet resultado = pst.executeQuery();
            
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "Dados\n\nCodigo do aluno: " + resultado.getString("id") + "\nNome: " + resultado.getString("nome") + "\nMatricula: " + resultado.getString("matricula"), "Dados do aluno", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        }
        
    }
    
    public static void mostrarTodos(){
        try {
            String sqlQuery = "SELECT * FROM alunos";
            
            PreparedStatement pst = Conexao.conectar().prepareStatement(sqlQuery);
            ResultSet resultado = pst.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Exibido no console", "Abra o console", JOptionPane.INFORMATION_MESSAGE);
            
            System.out.println("\n------------------");
            System.out.println("\nALUNOS CADASTRADOS");
            while(resultado.next()){
                System.out.println("\nID: " + resultado.getString("id") + "\nNome: " + resultado.getString("nome") + "\nMatricula: " + resultado.getString("matricula"));  
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        }   
    }
    
    public static void deletar(String id){
        try {
            String sqlQuery = "DELETE FROM alunos WHERE id = ?";
        
            PreparedStatement pst = Conexao.conectar().prepareStatement(sqlQuery);
            pst.setString(1, id);
            int resultado = pst.executeUpdate();
            
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Erro, operação não realizada", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        }
    }
}