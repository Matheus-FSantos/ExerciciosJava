/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Conexao.Conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mfm65
 */
public class Chamados {
    private int numeroMaquina;
    private String usuario;
    private String descricao;

    public Chamados(int numeroMaquina, String usuario, String descricao) {
        this.numeroMaquina = numeroMaquina;
        this.usuario = usuario;
        this.descricao = descricao;
    }
    
    public boolean registrar(){
        try {
            boolean status = GerenciaUsuarios.verificaUsuario(this.getUsuario());
            
            if(status == false){
                return false;
            } else {
                String sqlQuery = "INSERT INTO chamados VALUES (?, ?, ?, ?, now())";
            
                PreparedStatement pst = Conector.conectar().prepareStatement(sqlQuery);

                pst.setString(1, "0");
                pst.setString(2, this.getNumeroMaquina() + "");
                pst.setString(3, this.getUsuario());
                pst.setString(4, this.getDescricao());

                pst.executeUpdate();

                return true;
            }
        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
            return false;
        }
    }

    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    private void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    public String getUsuario() {
        return usuario;
    }

    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}