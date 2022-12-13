/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Classes.GerenciaJanelas;
import Classes.Usuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author mfm65
 */
public class Cadastro extends javax.swing.JFrame {

    private char senhaEchoChar;

    public Cadastro() {
        initComponents();
        senhaEchoChar = inputSenha.getEchoChar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        esquerda = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        linhaInputNome = new javax.swing.JPanel();
        inputSenha = new javax.swing.JPasswordField();
        linhaInputSenha = new javax.swing.JPanel();
        inputEmail = new javax.swing.JTextField();
        linhaInputEmail = new javax.swing.JPanel();
        mostrarSenha = new javax.swing.JCheckBox();
        iconeMostrarSenha = new javax.swing.JLabel();
        cadastroLabel2 = new javax.swing.JLabel();
        cadastroLabel = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        direita = new javax.swing.JPanel();
        imagemLogin = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignIn");
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        esquerda.setBackground(new java.awt.Color(18, 18, 18));

        titulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 102));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SignIn");

        nome.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(102, 102, 102));
        nome.setText("Nome:");

        senha.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        senha.setForeground(new java.awt.Color(102, 102, 102));
        senha.setText("Senha:");

        email.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("Email:");

        inputNome.setBackground(new java.awt.Color(18, 18, 18));
        inputNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputNome.setForeground(new java.awt.Color(255, 255, 255));
        inputNome.setBorder(null);
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        linhaInputNome.setBackground(new java.awt.Color(51, 51, 51));
        linhaInputNome.setPreferredSize(new java.awt.Dimension(10, 2));

        javax.swing.GroupLayout linhaInputNomeLayout = new javax.swing.GroupLayout(linhaInputNome);
        linhaInputNome.setLayout(linhaInputNomeLayout);
        linhaInputNomeLayout.setHorizontalGroup(
            linhaInputNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linhaInputNomeLayout.setVerticalGroup(
            linhaInputNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        inputSenha.setBackground(new java.awt.Color(18, 18, 18));
        inputSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputSenha.setForeground(new java.awt.Color(255, 255, 255));
        inputSenha.setBorder(null);

        linhaInputSenha.setBackground(new java.awt.Color(51, 51, 51));
        linhaInputSenha.setPreferredSize(new java.awt.Dimension(10, 2));

        javax.swing.GroupLayout linhaInputSenhaLayout = new javax.swing.GroupLayout(linhaInputSenha);
        linhaInputSenha.setLayout(linhaInputSenhaLayout);
        linhaInputSenhaLayout.setHorizontalGroup(
            linhaInputSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linhaInputSenhaLayout.setVerticalGroup(
            linhaInputSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        inputEmail.setBackground(new java.awt.Color(18, 18, 18));
        inputEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputEmail.setForeground(new java.awt.Color(255, 255, 255));
        inputEmail.setBorder(null);
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        linhaInputEmail.setBackground(new java.awt.Color(51, 51, 51));
        linhaInputEmail.setPreferredSize(new java.awt.Dimension(10, 2));

        javax.swing.GroupLayout linhaInputEmailLayout = new javax.swing.GroupLayout(linhaInputEmail);
        linhaInputEmail.setLayout(linhaInputEmailLayout);
        linhaInputEmailLayout.setHorizontalGroup(
            linhaInputEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linhaInputEmailLayout.setVerticalGroup(
            linhaInputEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        mostrarSenha.setForeground(new java.awt.Color(102, 102, 102));
        mostrarSenha.setText("Mostrar Senha");
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });

        iconeMostrarSenha.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\exibirSenha.png")); // NOI18N

        cadastroLabel2.setForeground(new java.awt.Color(102, 102, 102));
        cadastroLabel2.setText("Já possui uma conta?");

        cadastroLabel.setForeground(new java.awt.Color(204, 204, 255));
        cadastroLabel.setText("Realize Login");
        cadastroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroLabelMouseClicked(evt);
            }
        });

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout esquerdaLayout = new javax.swing.GroupLayout(esquerda);
        esquerda.setLayout(esquerdaLayout);
        esquerdaLayout.setHorizontalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputSenha)
                            .addComponent(linhaInputNome, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(senha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNome)
                            .addComponent(linhaInputSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(linhaInputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(inputEmail))
                        .addGap(134, 134, 134))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addComponent(iconeMostrarSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrarSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addComponent(cadastroLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadastroLabel)))
                        .addContainerGap(203, Short.MAX_VALUE))))
        );
        esquerdaLayout.setVerticalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(linhaInputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(linhaInputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(linhaInputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroLabel2)
                    .addComponent(cadastroLabel))
                .addGap(18, 18, 18)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconeMostrarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmar)
                .addGap(33, 33, 33))
        );

        direita.setBackground(new java.awt.Color(0, 0, 0));

        imagemLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemLogin.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\login.png")); // NOI18N

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );
        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
        if (mostrarSenha.isSelected()) {
            iconeMostrarSenha.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\ocultarSenha.png"));
            inputSenha.setEchoChar('\u0000');
            mostrarSenha.setText("Ocultar Senha");
        } else {
            iconeMostrarSenha.setIcon(new javax.swing.ImageIcon("C:\\imagensCursoUdemyJava\\Projeto 02\\exibirSenha.png"));
            inputSenha.setEchoChar(senhaEchoChar);
            mostrarSenha.setText("Mostrar Senha");
        }
    }//GEN-LAST:event_mostrarSenhaActionPerformed

    private void cadastroLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroLabelMouseClicked
        GerenciaJanelas.login(this);
    }//GEN-LAST:event_cadastroLabelMouseClicked

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if (inputNome.getText().equals("") || inputSenha.getText().equals("") || inputEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Existe campos que não foram preenchidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            String nome = inputNome.getText();
            String senha = inputSenha.getText();
            String email = inputEmail.getText();
            Usuarios usuario = new Usuarios(nome, senha, email);
            
            boolean parametro = usuario.registrar();

            if(parametro){
                inputNome.setText("");
                inputSenha.setText("");
                inputEmail.setText("");
                
                GerenciaJanelas.login(this);
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastroLabel;
    private javax.swing.JLabel cadastroLabel2;
    private javax.swing.JButton confirmar;
    private javax.swing.JPanel direita;
    private javax.swing.JLabel email;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel iconeMostrarSenha;
    private javax.swing.JLabel imagemLogin;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel linhaInputEmail;
    private javax.swing.JPanel linhaInputNome;
    private javax.swing.JPanel linhaInputSenha;
    private javax.swing.JCheckBox mostrarSenha;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
