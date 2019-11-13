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
public class statisticsWindow extends javax.swing.JFrame {

    /**
     * Creates new form statisticsWindow
     */
    public statisticsWindow() {
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
        pleventTitle = new javax.swing.JLabel();
        statisticsTitle = new javax.swing.JLabel();
        catReviewsButton = new javax.swing.JButton();
        bestEventsButton = new javax.swing.JButton();
        worstEventsButton = new javax.swing.JButton();
        ageUsersButton = new javax.swing.JButton();
        catEventsButton = new javax.swing.JButton();
        catPeopleButton = new javax.swing.JButton();
        dateEventsButton = new javax.swing.JButton();
        mostAssEventsButton = new javax.swing.JButton();
        closeWindow = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pleventTitle.setFont(new java.awt.Font("Edwardian Script ITC", 0, 72)); // NOI18N
        pleventTitle.setForeground(new java.awt.Color(8, 151, 157));
        pleventTitle.setText("Plevent");
        jPanel1.add(pleventTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 170, 60));

        statisticsTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        statisticsTitle.setText("Módulo de estadísticas");
        jPanel1.add(statisticsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        catReviewsButton.setBackground(new java.awt.Color(8, 151, 157));
        catReviewsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        catReviewsButton.setForeground(new java.awt.Color(255, 255, 255));
        catReviewsButton.setText("Reseñas por categoría");
        catReviewsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catReviewsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catReviewsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(catReviewsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 230, 40));

        bestEventsButton.setBackground(new java.awt.Color(8, 151, 157));
        bestEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bestEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        bestEventsButton.setText("Eventos mejor calificados");
        bestEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(bestEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 230, 40));

        worstEventsButton.setBackground(new java.awt.Color(8, 151, 157));
        worstEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        worstEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        worstEventsButton.setText("Eventos peor calificados");
        worstEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(worstEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 230, 40));

        ageUsersButton.setBackground(new java.awt.Color(8, 151, 157));
        ageUsersButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ageUsersButton.setForeground(new java.awt.Color(255, 255, 255));
        ageUsersButton.setText("Usuarios por edad");
        ageUsersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ageUsersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageUsersButtonMouseClicked(evt);
            }
        });
        jPanel1.add(ageUsersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 230, 40));

        catEventsButton.setBackground(new java.awt.Color(8, 151, 157));
        catEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        catEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        catEventsButton.setText("Eventos por categoría");
        catEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catEventsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catEventsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(catEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 40));

        catPeopleButton.setBackground(new java.awt.Color(8, 151, 157));
        catPeopleButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        catPeopleButton.setForeground(new java.awt.Color(255, 255, 255));
        catPeopleButton.setText("Personas por categoría");
        catPeopleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catPeopleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catPeopleButtonMouseClicked(evt);
            }
        });
        jPanel1.add(catPeopleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 40));

        dateEventsButton.setBackground(new java.awt.Color(8, 151, 157));
        dateEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        dateEventsButton.setText("Eventos por fecha");
        dateEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(dateEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, 40));

        mostAssEventsButton.setBackground(new java.awt.Color(8, 151, 157));
        mostAssEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostAssEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        mostAssEventsButton.setText("Eventos con mayor asistencia");
        mostAssEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostAssEventsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostAssEventsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(mostAssEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 230, 40));

        closeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/closeWindow.png"))); // NOI18N
        closeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindowMouseClicked(evt);
            }
        });
        jPanel1.add(closeWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(statisticsWindow.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindowMouseClicked
        this.setVisible(false);
        AdminWindow admin = new AdminWindow();
    }//GEN-LAST:event_closeWindowMouseClicked

    private void ageUsersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageUsersButtonMouseClicked
        this.setVisible(false);
        AgeStatisticWindow age= new AgeStatisticWindow(this);
    }//GEN-LAST:event_ageUsersButtonMouseClicked

    private void catEventsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catEventsButtonMouseClicked
        this.setVisible(false);
        EventsCategoryStatisticWindow eventC = new EventsCategoryStatisticWindow(this);
    }//GEN-LAST:event_catEventsButtonMouseClicked

    private void catPeopleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catPeopleButtonMouseClicked
        this.setVisible(false);
        PeopleCategoryStatisticWindow peopleC = new PeopleCategoryStatisticWindow(this);
    }//GEN-LAST:event_catPeopleButtonMouseClicked

    private void catReviewsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catReviewsButtonMouseClicked
        this.setVisible(false);
        ReviewPerCategoryStatisticWindow review = new ReviewPerCategoryStatisticWindow(this);
    }//GEN-LAST:event_catReviewsButtonMouseClicked

    private void mostAssEventsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostAssEventsButtonMouseClicked
        this.setVisible(false);
        MostAssistedEventsWindow mostA = new MostAssistedEventsWindow(this);
    }//GEN-LAST:event_mostAssEventsButtonMouseClicked

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
            java.util.logging.Logger.getLogger(statisticsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statisticsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statisticsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statisticsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statisticsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ageUsersButton;
    private javax.swing.JButton bestEventsButton;
    private javax.swing.JButton catEventsButton;
    private javax.swing.JButton catPeopleButton;
    private javax.swing.JButton catReviewsButton;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JButton dateEventsButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton mostAssEventsButton;
    private javax.swing.JLabel pleventTitle;
    private javax.swing.JLabel statisticsTitle;
    private javax.swing.JButton worstEventsButton;
    // End of variables declaration//GEN-END:variables
}
