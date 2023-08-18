/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1_parcial1;

/**
 *
 * @author Azalia
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        btnAgregarPost = new javax.swing.JButton();
        btnAgregarCuenta = new javax.swing.JButton();
        btnAgregarAmigo = new javax.swing.JButton();
        btnAgregarComment = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProfileForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Menu");

        btnAgregarPost.setBackground(new java.awt.Color(153, 153, 0));
        btnAgregarPost.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnAgregarPost.setText("Agregar Post");
        btnAgregarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPostActionPerformed(evt);
            }
        });

        btnAgregarCuenta.setBackground(new java.awt.Color(153, 153, 0));
        btnAgregarCuenta.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnAgregarCuenta.setText("Agregar Cuenta");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });

        btnAgregarAmigo.setBackground(new java.awt.Color(153, 153, 0));
        btnAgregarAmigo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnAgregarAmigo.setText("Agregar Amigo ");
        btnAgregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAmigoActionPerformed(evt);
            }
        });

        btnAgregarComment.setBackground(new java.awt.Color(153, 153, 0));
        btnAgregarComment.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnAgregarComment.setText("Agregar Comment");
        btnAgregarComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCommentActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnProfileForm.setBackground(new java.awt.Color(153, 153, 0));
        btnProfileForm.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnProfileForm.setText("Profile Form");
        btnProfileForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnAgregarPost))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarAmigo)
                            .addComponent(btnAgregarCuenta))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarComment)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProfileForm)
                        .addGap(115, 115, 115))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarCuenta)
                .addGap(30, 30, 30)
                .addComponent(btnAgregarPost)
                .addGap(27, 27, 27)
                .addComponent(btnAgregarAmigo)
                .addGap(31, 31, 31)
                .addComponent(btnAgregarComment)
                .addGap(26, 26, 26)
                .addComponent(btnProfileForm)
                .addGap(38, 38, 38)
                .addComponent(btnSalir)
                .addContainerGap(70, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPostActionPerformed
        // TODO add your handling code here:
        BuscarItem buscar= new BuscarItem();
        buscar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarPostActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        // TODO add your handling code here:
        AgregarItem agregar= new AgregarItem();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void btnAgregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAmigoActionPerformed
        // TODO add your handling code here:
        Rentar rentar= new Rentar();
        rentar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarAmigoActionPerformed

    private void btnAgregarCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCommentActionPerformed
        // TODO add your handling code here:
        AuditarMovieEstado auditar= new AuditarMovieEstado();
        auditar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarCommentActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnProfileFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileFormActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAmigo;
    private javax.swing.JButton btnAgregarComment;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarPost;
    private javax.swing.JButton btnProfileForm;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
