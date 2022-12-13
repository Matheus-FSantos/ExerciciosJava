/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Classes.GerenciaJanelas;
import javax.swing.JOptionPane;

/**
 *
 * @author mfm65
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private static String nome = null;
    
    public TelaPrincipal() {
        if(nome != null){
            initComponents();
            nomeUsuario.setText(nome);
        } else {
            JOptionPane.showMessageDialog(null, "Você não está logado!", "Erro!", JOptionPane.ERROR_MESSAGE);
            GerenciaJanelas.login(this);
        }
    }
    
    public static void nome(String usuario){
        String primeiraString = usuario.substring(0, 1).toUpperCase();
        String resto = usuario.substring(1,usuario.length());
        usuario = primeiraString + resto;
        nome = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();
        botaoChamado = new javax.swing.JButton();
        descricaoChamado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        descricaoChamado1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        nomeUsuario = new javax.swing.JMenu();
        sair = new javax.swing.JMenu();
        cadastroMenu = new javax.swing.JMenu();
        cadastroChamado = new javax.swing.JMenuItem();
        verificarMenu = new javax.swing.JMenu();
        verificaChamado = new javax.swing.JMenuItem();
        verificaChamadoProprio = new javax.swing.JMenuItem();
        editarMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        areaDeTrabalho.setBackground(new java.awt.Color(63, 78, 79));

        botaoChamado.setBackground(new java.awt.Color(51, 153, 255));
        botaoChamado.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\pastaCriarChamado.png")); // NOI18N
        botaoChamado.setBorder(null);
        botaoChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChamadoActionPerformed(evt);
            }
        });

        descricaoChamado.setForeground(new java.awt.Color(255, 255, 255));
        descricaoChamado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricaoChamado.setText("Abrir chamado");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\verificarChamados.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        descricaoChamado1.setForeground(new java.awt.Color(255, 255, 255));
        descricaoChamado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricaoChamado1.setText("Chamados");

        areaDeTrabalho.setLayer(botaoChamado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaDeTrabalho.setLayer(descricaoChamado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaDeTrabalho.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaDeTrabalho.setLayer(descricaoChamado1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaDeTrabalhoLayout = new javax.swing.GroupLayout(areaDeTrabalho);
        areaDeTrabalho.setLayout(areaDeTrabalhoLayout);
        areaDeTrabalhoLayout.setHorizontalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
                        .addComponent(botaoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
                        .addComponent(descricaoChamado)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoChamado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(1007, Short.MAX_VALUE))
        );
        areaDeTrabalhoLayout.setVerticalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoChamado1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(508, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(63, 78, 79));
        menu.setForeground(new java.awt.Color(0, 0, 0));

        nomeUsuario.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\icone.png")); // NOI18N
        nomeUsuario.setEnabled(false);
        nomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(nomeUsuario);

        sair.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\sair.png")); // NOI18N
        sair.setText("Sair");
        sair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        menu.add(sair);

        cadastroMenu.setBackground(new java.awt.Color(40, 42, 58));
        cadastroMenu.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\discoRigido.png")); // NOI18N
        cadastroMenu.setText("Cadastro");
        cadastroMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cadastroChamado.setBackground(new java.awt.Color(40, 42, 58));
        cadastroChamado.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\discoRigido.png")); // NOI18N
        cadastroChamado.setText("Cadastro de Chamado");
        cadastroChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroChamadoActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastroChamado);

        menu.add(cadastroMenu);

        verificarMenu.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\verificar.png")); // NOI18N
        verificarMenu.setText("Verificar");
        verificarMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        verificaChamado.setBackground(new java.awt.Color(40, 42, 58));
        verificaChamado.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\verificar.png")); // NOI18N
        verificaChamado.setText("Verifica Chamados");
        verificaChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificaChamadoActionPerformed(evt);
            }
        });
        verificarMenu.add(verificaChamado);

        verificaChamadoProprio.setBackground(new java.awt.Color(40, 42, 58));
        verificaChamadoProprio.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\verificar.png")); // NOI18N
        verificaChamadoProprio.setText("Verifica Chamados Proprio");
        verificaChamadoProprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificaChamadoProprioActionPerformed(evt);
            }
        });
        verificarMenu.add(verificaChamadoProprio);

        menu.add(verificarMenu);

        editarMenu.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\editar.png")); // NOI18N
        editarMenu.setText("Editar");
        editarMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(editarMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(areaDeTrabalho)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaDeTrabalho)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void verificaChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificaChamadoActionPerformed
        GerenciaJanelas.verificaChamados(areaDeTrabalho);
    }//GEN-LAST:event_verificaChamadoActionPerformed

    private void botaoChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChamadoActionPerformed
        GerenciaJanelas.cadastroChamado(areaDeTrabalho);
    }//GEN-LAST:event_botaoChamadoActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        GerenciaJanelas.login(this);
    }//GEN-LAST:event_sairMouseClicked

    private void cadastroChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroChamadoActionPerformed
        GerenciaJanelas.cadastroChamado(areaDeTrabalho);
    }//GEN-LAST:event_cadastroChamadoActionPerformed

    private void verificaChamadoProprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificaChamadoProprioActionPerformed
        GerenciaJanelas.verificaChamados(areaDeTrabalho, nome);
    }//GEN-LAST:event_verificaChamadoProprioActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        GerenciaJanelas.verificaChamados(areaDeTrabalho);
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JButton botaoChamado;
    private javax.swing.JMenuItem cadastroChamado;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JLabel descricaoChamado;
    private javax.swing.JLabel descricaoChamado1;
    private javax.swing.JMenu editarMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu nomeUsuario;
    private javax.swing.JMenu sair;
    private javax.swing.JMenuItem verificaChamado;
    private javax.swing.JMenuItem verificaChamadoProprio;
    private javax.swing.JMenu verificarMenu;
    // End of variables declaration//GEN-END:variables
}
