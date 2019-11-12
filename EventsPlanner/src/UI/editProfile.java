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
public class editProfile extends javax.swing.JFrame {

    /**
     * Creates new form editProfile
     */
    public editProfile() {
        initComponents();
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
        updateInformation = new javax.swing.JLabel();
        dateOfBithButton = new javax.swing.JButton();
        nameButton = new javax.swing.JButton();
        passwordButton = new javax.swing.JButton();
        phoneButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        idNumberLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailButton = new javax.swing.JButton();
        idNumberButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        photoButton = new javax.swing.JButton();
        dateOfBirth = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        pleventTitle = new javax.swing.JLabel();
        closeWindow = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateInformation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        updateInformation.setText("Actualiza tu información");
        jPanel1.add(updateInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 80, -1, -1));

        dateOfBithButton.setBackground(new java.awt.Color(255, 255, 255));
        dateOfBithButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dateOfBirth.png"))); // NOI18N
        dateOfBithButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dateOfBithButton.setPreferredSize(new java.awt.Dimension(100, 100));
        dateOfBithButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateOfBithButtonMouseClicked(evt);
            }
        });
        jPanel1.add(dateOfBithButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 100));

        nameButton.setBackground(new java.awt.Color(255, 255, 255));
        nameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userName.png"))); // NOI18N
        nameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameButton.setPreferredSize(new java.awt.Dimension(100, 100));
        nameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameButtonMouseClicked(evt);
            }
        });
        jPanel1.add(nameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 100));

        passwordButton.setBackground(new java.awt.Color(255, 255, 255));
        passwordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N
        passwordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordButton.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(passwordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 100, 100));

        phoneButton.setBackground(new java.awt.Color(255, 255, 255));
        phoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone.png"))); // NOI18N
        phoneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phoneButton.setPreferredSize(new java.awt.Dimension(100, 100));
        phoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneButtonMouseClicked(evt);
            }
        });
        jPanel1.add(phoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 100, 100));

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setText("Nombre");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        idNumberLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idNumberLabel.setText("Cédula o pasaporte");
        jPanel1.add(idNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, -1));

        phoneLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phoneLabel.setText("Teléfono");
        jPanel1.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 60, -1));

        emailLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 100, -1));

        emailButton.setBackground(new java.awt.Color(255, 255, 255));
        emailButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email.png"))); // NOI18N
        emailButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emailButton.setPreferredSize(new java.awt.Dimension(100, 100));
        emailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailButtonMouseClicked(evt);
            }
        });
        jPanel1.add(emailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 100, 100));

        idNumberButton.setBackground(new java.awt.Color(255, 255, 255));
        idNumberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/idNumber.png"))); // NOI18N
        idNumberButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idNumberButton.setPreferredSize(new java.awt.Dimension(100, 100));
        idNumberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idNumberButtonMouseClicked(evt);
            }
        });
        jPanel1.add(idNumberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 100));

        usersButton.setBackground(new java.awt.Color(255, 255, 255));
        usersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userType.png"))); // NOI18N
        usersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersButton.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(usersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 100));

        photoButton.setBackground(new java.awt.Color(255, 255, 255));
        photoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camera2.png"))); // NOI18N
        photoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        photoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(photoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 100, 100));

        dateOfBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateOfBirth.setText("Fecha de nacimiento");
        jPanel1.add(dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 140, -1));

        userTypeLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userTypeLabel.setText("Tipo de usuario");
        jPanel1.add(userTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        photoLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        photoLabel.setText("Foto");
        jPanel1.add(photoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 410, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordLabel.setText("Usuario y contraseña");
        jPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 410, 140, 20));

        pleventTitle.setFont(new java.awt.Font("Edwardian Script ITC", 0, 72)); // NOI18N
        pleventTitle.setForeground(new java.awt.Color(8, 151, 157));
        pleventTitle.setText("Plevent");
        jPanel1.add(pleventTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 170, 60));

        closeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/closeWindow.png"))); // NOI18N
        closeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindowMouseClicked(evt);
            }
        });
        jPanel1.add(closeWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_closeWindowMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(editProfile.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void nameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameButtonMouseClicked
        this.setVisible(false);
        nameWindow name = new nameWindow(this);
        
    }//GEN-LAST:event_nameButtonMouseClicked

    private void idNumberButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idNumberButtonMouseClicked
        this.setVisible(false);
        idNumberWindow idN = new idNumberWindow(this);
    }//GEN-LAST:event_idNumberButtonMouseClicked

    private void phoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneButtonMouseClicked
        this.setVisible(false);
        telephoneWindow tW = new telephoneWindow(this);
    }//GEN-LAST:event_phoneButtonMouseClicked

    private void emailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailButtonMouseClicked
        this.setVisible(false);
        emailWindow eW = new emailWindow(this);
    }//GEN-LAST:event_emailButtonMouseClicked

    private void dateOfBithButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateOfBithButtonMouseClicked
        this.setVisible(false);
        dateOfBirthWindow eW = new dateOfBirthWindow(this);
    }//GEN-LAST:event_dateOfBithButtonMouseClicked

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
            java.util.logging.Logger.getLogger(editProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeWindow;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JButton dateOfBithButton;
    private javax.swing.JButton emailButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton idNumberButton;
    private javax.swing.JLabel idNumberLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton nameButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton passwordButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton phoneButton;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton photoButton;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel pleventTitle;
    private javax.swing.JLabel updateInformation;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables
}
