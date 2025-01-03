/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ITotal;

/**
 *
 * @author kenandja
 */
public class MainView extends javax.swing.JFrame {
    private ITotal controleController;
    
    /**
     * Creates new form MainView
     */
    public MainView(ITotal controleController) {
        this.controleController = controleController;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBarMain = new javax.swing.JMenuBar();
        jMenuCursos = new javax.swing.JMenu();
        jMenuInscricao = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCurso = new javax.swing.JMenuItem();
        jMenuItemEstudante = new javax.swing.JMenuItem();
        jMenuItemInstrutor = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cursos Online");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/Play.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuCursos.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/world.png")); // NOI18N
        jMenuCursos.setText("Cursos");
        jMenuCursos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuInscricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuInscricao.setForeground(new java.awt.Color(0, 0, 0));
        jMenuInscricao.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/seta.png")); // NOI18N
        jMenuInscricao.setText("Inscrição");
        jMenuInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInscricaoActionPerformed(evt);
            }
        });
        jMenuCursos.add(jMenuInscricao);

        jMenuBarMain.add(jMenuCursos);

        jMenuCadastro.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/form.png")); // NOI18N
        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuItemCurso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemCurso.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/seta.png")); // NOI18N
        jMenuItemCurso.setText("Curso");
        jMenuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCursoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCurso);

        jMenuItemEstudante.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemEstudante.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/seta.png")); // NOI18N
        jMenuItemEstudante.setText("Estudante");
        jMenuItemEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstudanteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemEstudante);

        jMenuItemInstrutor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemInstrutor.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/seta.png")); // NOI18N
        jMenuItemInstrutor.setText("Instrutor");
        jMenuItemInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstrutorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemInstrutor);

        jMenuBarMain.add(jMenuCadastro);

        jMenuSair.setIcon(new javax.swing.ImageIcon("/home/kenandja/eclipse-workspace/CursosOnline/src/images/x_red.png")); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuSairMousePressed(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBarMain.add(jMenuSair);

        setJMenuBar(jMenuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCursoActionPerformed
        new CadastroCurso(this, this.controleController).setVisible(true);
    }//GEN-LAST:event_jMenuItemCursoActionPerformed

    private void jMenuItemEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstudanteActionPerformed
        // TODO add your handling code here:
        new CadastroEstudante(this, this.controleController).setVisible(true);
    }//GEN-LAST:event_jMenuItemEstudanteActionPerformed
        
    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMousePressed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMousePressed

    private void jMenuItemInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstrutorActionPerformed
        // TODO add your handling code here:
        new CadastroInstrutor(this, this.controleController).setVisible(true);
    }//GEN-LAST:event_jMenuItemInstrutorActionPerformed

    private void jMenuInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscricaoActionPerformed
        // TODO add your handling code here:
        new InscricaoEstudante(this, this.controleController).setVisible(true);
    }//GEN-LAST:event_jMenuInscricaoActionPerformed

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
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBarMain;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCursos;
    private javax.swing.JMenuItem jMenuInscricao;
    private javax.swing.JMenuItem jMenuItemCurso;
    private javax.swing.JMenuItem jMenuItemEstudante;
    private javax.swing.JMenuItem jMenuItemInstrutor;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
