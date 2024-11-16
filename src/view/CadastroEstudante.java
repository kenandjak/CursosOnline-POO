/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.ITotal;
import javax.swing.JOptionPane;

/**
 *
 * @author kenandja
 */
public class CadastroEstudante extends javax.swing.JFrame {

    /**
     * Creates new form CadastroEstudante
     */
    private MainView mainView;
    private ITotal controleController;
    
    public CadastroEstudante(MainView mainView, ITotal controleController) {
        initComponents();
        this.mainView = mainView;
        this.controleController = controleController;
    }
//    public CadastroEstudante(ControleEstudante estudantesController) {
//        this.estudantesController = estudantesController;
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTituloCadastroEstudante = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNomeEstudante = new javax.swing.JLabel();
        jLabelEmailEstudante = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldNomeEstudante = new javax.swing.JTextField();
        jTextFieldEmailEstudante = new javax.swing.JTextField();
        jTextFieldSenhaEstudante = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabelTituloCadastroEstudante.setFont(new java.awt.Font("Gayathri", 1, 36)); // NOI18N
        jLabelTituloCadastroEstudante.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloCadastroEstudante.setText("Cadastro de Estudante");

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabelNomeEstudante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNomeEstudante.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeEstudante.setText("Nome: ");

        jLabelEmailEstudante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelEmailEstudante.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmailEstudante.setText("E-mail: ");

        jLabelSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSenha.setText("Senha: ");

        jTextFieldNomeEstudante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeEstudante.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNomeEstudante.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNomeEstudante.setToolTipText("Digite o nome");

        jTextFieldEmailEstudante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmailEstudante.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldEmailEstudante.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldEmailEstudante.setToolTipText("Digite o email");

        jTextFieldSenhaEstudante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSenhaEstudante.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldSenhaEstudante.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldSenhaEstudante.setToolTipText("Password");

        jButtonSalvar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmailEstudante)
                            .addComponent(jLabelNomeEstudante))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmailEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSenhaEstudante)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeEstudante)
                    .addComponent(jTextFieldNomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailEstudante)
                    .addComponent(jTextFieldEmailEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jTextFieldSenhaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSalvar))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTituloCadastroEstudante)
                .addGap(209, 209, 209))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabelTituloCadastroEstudante)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarEstudante() {
        boolean sucesso;
        try {
            sucesso = controleController.cadastrarEstudante(jTextFieldNomeEstudante.getText(), jTextFieldEmailEstudante.getText(), jTextFieldSenhaEstudante.getText());
            if(sucesso == true) {
                JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso");
                this.limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente");
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }
    private void limpar() {
        jTextFieldNomeEstudante.setText("");
        jTextFieldEmailEstudante.setText("");
        jTextFieldSenhaEstudante.setText("");
    }
    private void cancelar() {
        /*this.dispose();
        mainView.setVisible(true);*/
        this.setVisible(false);
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        salvarEstudante();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CadastroEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastroEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastroEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastroEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastroEstudante().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelEmailEstudante;
    private javax.swing.JLabel jLabelNomeEstudante;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTituloCadastroEstudante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldEmailEstudante;
    private javax.swing.JTextField jTextFieldNomeEstudante;
    private javax.swing.JTextField jTextFieldSenhaEstudante;
    // End of variables declaration//GEN-END:variables
}
