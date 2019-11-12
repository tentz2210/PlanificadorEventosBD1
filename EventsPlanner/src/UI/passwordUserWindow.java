/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author mapac
 */
public class passwordUserWindow extends javax.swing.JFrame {

    /**
     * Creates new form passwordUserWindow
     */
    editProfile editP;
    public passwordUserWindow(editProfile ew) {
        initComponents();
        editP = ew;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        actualPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        cNewPasswordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        actualPasswordField = new javax.swing.JTextField();
        newPasswordField = new javax.swing.JTextField();
        cNewPasswordField = new javax.swing.JTextField();
        iconPassword = new javax.swing.JLabel();
        modifyUsernameButton = new javax.swing.JButton();
        modifyPasswordButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(403, 314));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actualPasswordLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        actualPasswordLabel.setText("Contraseña actual");
        jPanel1.add(actualPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        newPasswordLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newPasswordLabel.setText("Nueva contraseña");
        jPanel1.add(newPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, -1, -1));

        cNewPasswordLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cNewPasswordLabel.setText("Confirmar contraseña");
        jPanel1.add(cNewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, -1));

        usernameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameLabel.setText("Nuevo usuario");
        jPanel1.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        userNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userNameField.setMinimumSize(new java.awt.Dimension(120, 21));
        userNameField.setPreferredSize(new java.awt.Dimension(120, 21));
        jPanel1.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 190, -1, -1));

        actualPasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        actualPasswordField.setMinimumSize(new java.awt.Dimension(120, 21));
        actualPasswordField.setPreferredSize(new java.awt.Dimension(120, 21));
        jPanel1.add(actualPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 18, -1, -1));

        newPasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        newPasswordField.setMinimumSize(new java.awt.Dimension(120, 21));
        newPasswordField.setPreferredSize(new java.awt.Dimension(120, 21));
        jPanel1.add(newPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 62, -1, -1));

        cNewPasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cNewPasswordField.setMinimumSize(new java.awt.Dimension(120, 21));
        cNewPasswordField.setPreferredSize(new java.awt.Dimension(120, 21));
        jPanel1.add(cNewPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 105, -1, -1));

        iconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N
        jPanel1.add(iconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 100, 60));

        modifyUsernameButton.setBackground(new java.awt.Color(8, 151, 157));
        modifyUsernameButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modifyUsernameButton.setForeground(new java.awt.Color(255, 255, 255));
        modifyUsernameButton.setText("Modificar");
        modifyUsernameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyUsernameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyUsernameButtonMouseClicked(evt);
            }
        });
        jPanel1.add(modifyUsernameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        modifyPasswordButton.setBackground(new java.awt.Color(8, 151, 157));
        modifyPasswordButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modifyPasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        modifyPasswordButton.setText("Modificar");
        modifyPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyPasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyPasswordButtonMouseClicked(evt);
            }
        });
        jPanel1.add(modifyPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 145, -1, -1));

        cancelButton.setBackground(new java.awt.Color(132, 116, 161));
        cancelButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancelar");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -2, 410, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyPasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyPasswordButtonMouseClicked
        editP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modifyPasswordButtonMouseClicked

    private void modifyUsernameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyUsernameButtonMouseClicked
        editP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modifyUsernameButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        editP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseClicked

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
            java.util.logging.Logger.getLogger(passwordUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passwordUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passwordUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passwordUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actualPasswordField;
    private javax.swing.JLabel actualPasswordLabel;
    private javax.swing.JTextField cNewPasswordField;
    private javax.swing.JLabel cNewPasswordLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyPasswordButton;
    private javax.swing.JButton modifyUsernameButton;
    private javax.swing.JTextField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}