/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import AppPackage.AnimationClass;
import javax.swing.JOptionPane;

/**
 *
 * @author lin
 */
public class AdminWindow extends javax.swing.JFrame {

    /**
     * Creates new form AdminWindow
     */
    public AdminWindow() {
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
        closeWindIcon = new javax.swing.JLabel();
        minimizeWindIcon = new javax.swing.JLabel();
        menuIcon = new javax.swing.JLabel();
        statisticsIcon = new javax.swing.JLabel();
        cataloguesIcon = new javax.swing.JLabel();
        queriesIcon = new javax.swing.JLabel();
        accountSettingsIcon = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeWindIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/closeWindow.png"))); // NOI18N
        closeWindIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWindIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindIconMouseClicked(evt);
            }
        });
        jPanel1.add(closeWindIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, -1, -1));

        minimizeWindIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimizeWindIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeWindIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeWindIconMouseClicked(evt);
            }
        });
        jPanel1.add(minimizeWindIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, -1, -1));

        menuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        menuIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuIconMouseClicked(evt);
            }
        });
        jPanel1.add(menuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        statisticsIcon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        statisticsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statistics.png"))); // NOI18N
        statisticsIcon.setText("Módulo de Estadísticas");
        statisticsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(statisticsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-185, 60, -1, -1));

        cataloguesIcon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cataloguesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/catalogues.png"))); // NOI18N
        cataloguesIcon.setText("Catálogos");
        cataloguesIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cataloguesIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cataloguesIconMouseClicked(evt);
            }
        });
        jPanel1.add(cataloguesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-185, 102, -1, -1));

        queriesIcon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        queriesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/query.png"))); // NOI18N
        queriesIcon.setText("Consultas");
        queriesIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(queriesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-185, 144, -1, -1));

        accountSettingsIcon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accountSettingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userSettings.png"))); // NOI18N
        accountSettingsIcon.setText("Configuración");
        accountSettingsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountSettingsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountSettingsIconMouseClicked(evt);
            }
        });
        jPanel1.add(accountSettingsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-185, 186, -1, -1));

        logoutIcon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logoutIcon.setText("Cerrar sesión");
        logoutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(logoutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-185, 228, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeWindIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindIconMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(this,"¿Seguro que desea salir?","Cerrar sesión",dialog);
        if (result == 0)
        {
            this.setVisible(false);
            loginWindow login = new loginWindow();
        }
    }//GEN-LAST:event_closeWindIconMouseClicked

    private void minimizeWindIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindIconMouseClicked
        this.setState(AdminWindow.ICONIFIED);
    }//GEN-LAST:event_minimizeWindIconMouseClicked

    private void menuIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIconMouseClicked
        AnimationClass statisticsR = new AnimationClass();
        statisticsR.jLabelXRight(-185, 10, 10, 5, statisticsIcon);
        AnimationClass accSettingsR = new AnimationClass();
        accSettingsR.jLabelXRight(-185, 10, 10, 5, accountSettingsIcon);
        AnimationClass cataloguesR = new AnimationClass();
        cataloguesR.jLabelXRight(-185, 10, 10, 5, cataloguesIcon);
        AnimationClass queriesR = new AnimationClass();
        queriesR.jLabelXRight(-185, 10, 10, 5, queriesIcon);
        AnimationClass logoutR = new AnimationClass();
        logoutR.jLabelXRight(-185, 10, 10, 5, logoutIcon);
        
        //<--
        AnimationClass statisticsL = new AnimationClass();
        statisticsL.jLabelXLeft(10, -185, 10, 5, statisticsIcon);
        AnimationClass accSettingsL = new AnimationClass();
        accSettingsL.jLabelXLeft(10, -185, 10, 5, accountSettingsIcon);
        AnimationClass cataloguesL = new AnimationClass();
        cataloguesL.jLabelXLeft(10,-185,10,5,cataloguesIcon);
        AnimationClass queriesL = new AnimationClass();
        queriesL.jLabelXLeft(10,-185,10,5,queriesIcon);
        AnimationClass logoutL = new AnimationClass();
        logoutL.jLabelXLeft(10,-185,10,5,logoutIcon);
    }//GEN-LAST:event_menuIconMouseClicked

    private void accountSettingsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountSettingsIconMouseClicked
        this.setVisible(false);
        editProfile edit = new editProfile();
    }//GEN-LAST:event_accountSettingsIconMouseClicked

    private void cataloguesIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cataloguesIconMouseClicked
        this.setVisible(false);
        cataloguesWindow edit = new cataloguesWindow();
    }//GEN-LAST:event_cataloguesIconMouseClicked

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
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountSettingsIcon;
    private javax.swing.JLabel cataloguesIcon;
    private javax.swing.JLabel closeWindIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel menuIcon;
    private javax.swing.JLabel minimizeWindIcon;
    private javax.swing.JLabel queriesIcon;
    private javax.swing.JLabel statisticsIcon;
    // End of variables declaration//GEN-END:variables
}
