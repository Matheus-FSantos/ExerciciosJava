/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Conexao.Conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mfm65
 */
public class Usuarios {
    private int id;
    private String nome;
    private String senha;
    private String email;
    
    public Usuarios(String nome, String senha, String email){
        setNome(nome);
        setSenha(senha);
        setEmail(email);
    }
    
    public boolean registrar(){
        try {
            String sqlQuery = "INSERT INTO usuarios VALUES (?, ?, ?, ?)";
            
            PreparedStatement pst = Conector.conectar().prepareStatement(sqlQuery);
            
            pst.setString(1, "0");
            pst.setString(2, this.getNome());
            pst.setString(3, this.getSenha());
            pst.setString(4, this.getEmail());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
            JOptionPane.showMessageDialog(null, "Ops... Deu algum erro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    private void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
    private void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
}