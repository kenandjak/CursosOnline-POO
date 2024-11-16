/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.ITotal;
import javax.swing.JOptionPane;
//import javax.swing.SpinnerNumberModel;

/**
 *
 * @author kenandja
 */
public class CadastroCurso extends javax.swing.JFrame {
    
    private MainView mainView;
    private ITotal controleController;
    /**
     * Creates new form CadastroCurso
     */
    public CadastroCurso(MainView mainView, ITotal controleController) {
        initComponents();
        this.mainView = mainView;
        this.controleController = controleController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroCurso = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldId1 = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelInstrutor = new javax.swing.JLabel();
        jTextFieldInstrutorCpf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cursos Online");
        setBackground(new java.awt.Color(255, 102, 204));
        setResizable(false);

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Gayathri", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("Cadastro de Curso");

        jPanelCadastroCurso.setBackground(new java.awt.Color(255, 102, 255));
        jPanelCadastroCurso.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNome.setText("Nome:");

        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNome.setToolTipText("Digite o nome do curso");

        jLabelDescricao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescricao.setText("Descrição:");

        jTextFieldDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDescricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldDescricao.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldDescricao.setToolTipText("Digite a descrição do curso");

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(0, 0, 0));
        jLabelId.setText("ID: ");

        jTextFieldId.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldId.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldId.setToolTipText("Insira o ID do curso");

        jLabelPreco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPreco.setText("Preço: ");

        jTextFieldId1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldId1.setToolTipText("Insira o ID do curso");

        jTextFieldPreco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPreco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldPreco.setForeground(new java.awt.Color(102, 102, 102));

        jButtonSalvar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelInstrutor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelInstrutor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelInstrutor.setText("Instrutor(a): ");

        jTextFieldInstrutorCpf.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldInstrutorCpf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldInstrutorCpf.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldInstrutorCpf.setToolTipText("Cpf instrutor(a)");

        javax.swing.GroupLayout jPanelCadastroCursoLayout = new javax.swing.GroupLayout(jPanelCadastroCurso);
        jPanelCadastroCurso.setLayout(jPanelCadastroCursoLayout);
        jPanelCadastroCursoLayout.setHorizontalGroup(
            jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroCursoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroCursoLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelId)
                            .addComponent(jLabelPreco)
                            .addComponent(jLabelInstrutor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addComponent(jTextFieldPreco)
                            .addComponent(jTextFieldInstrutorCpf)))
                    .addGroup(jPanelCadastroCursoLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCadastroCursoLayout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(jTextFieldId1)
                    .addGap(37, 37, 37)))
        );
        jPanelCadastroCursoLayout.setVerticalGroup(
            jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroCursoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstrutor)
                    .addComponent(jTextFieldInstrutorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanelCadastroCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCadastroCursoLayout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jTextFieldId1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(241, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabelTitulo))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelCadastroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarCurso() {
        // Quando preço era float: float preco = Float.parseFloat(jSpinnerPreco.getValue().toString());
        boolean sucesso;
        try {
            sucesso = controleController.cadastrarCurso(jTextFieldNome.getText(), jTextFieldDescricao.getText(), 
                    jTextFieldId.getText(), jTextFieldPreco.getText(), jTextFieldInstrutorCpf.getText());
            if(sucesso == true) {
                JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
                this.limparCurso();
                
            }else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
         // Caso de Exceção: se não houver conexão com o banco de dados
        } catch(Exception ex) {
            // Erro técnico
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }
    
    private void limparCurso() {
        jTextFieldNome.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldId.setText("");
        jTextFieldPreco.setText("");
        jTextFieldInstrutorCpf.setText("");
    }
    
    private void cancelarCurso() {
        /*this.dispose();
        mainView.setVisible(true);*/
        this.setVisible(false);
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
       salvarCurso();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        limparCurso();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        cancelarCurso();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastroCurso().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelInstrutor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastroCurso;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldId1;
    private javax.swing.JTextField jTextFieldInstrutorCpf;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables
}