/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import Frames.*;
import FramesInternos.*;
import javax.swing.*;
/**
 *
 * @author mfm65
 */
public class GerenciaJanelas {
    public static void cadastro(Entrar login){
        login.dispose();
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }
    
    public static void login(Cadastro cadastro){
        cadastro.dispose();
        Entrar entrar = new Entrar();
        entrar.setVisible(true);
    }
    
    public static void login(TelaPrincipal principal){
        principal.dispose();
        Entrar entrar = new Entrar();
        entrar.setVisible(true);
    }

    public static void telaPrincipal(Entrar entrar, String nome) {
        entrar.dispose();
        TelaPrincipal tela = null;
        tela.nome(nome);
        tela = new TelaPrincipal();        
        tela.setVisible(true);
    }
    
    public static void cadastroChamado(JDesktopPane areaDeTrabalho){
        CadastroChamado cadastro = new CadastroChamado();
        areaDeTrabalho.add(cadastro);
        cadastro.setVisible(true);
    }
    
    public static void verificaChamados(JDesktopPane areaDeTrabalho){
        VerificaChamados chamados = new VerificaChamados();
        areaDeTrabalho.add(chamados);
        chamados.setVisible(true);
    }

    public static void verificaChamados(JDesktopPane areaDeTrabalho, String nome) {
        VerificaChamadosProprio chamados = null;
        chamados.nome(nome);
        chamados = new VerificaChamadosProprio();
        areaDeTrabalho.add(chamados);
        chamados.setVisible(true);
    }
}