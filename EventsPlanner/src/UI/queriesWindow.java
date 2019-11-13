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
public class queriesWindow extends javax.swing.JFrame {

    /**
     * Creates new form queriesWindow
     */
    public queriesWindow() {
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
        publicEventsButton = new javax.swing.JButton();
        reviewsXEventButton = new javax.swing.JButton();
        invitationsButton = new javax.swing.JButton();
        invitedUsersButton = new javax.swing.JButton();
        pastEventsButton = new javax.swing.JButton();
        assistEventsButton = new javax.swing.JButton();
        futureEventsButton = new javax.swing.JButton();
        closeWindow = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pleventTitle.setFont(new java.awt.Font("Edwardian Script ITC", 0, 72)); // NOI18N
        pleventTitle.setForeground(new java.awt.Color(132, 116, 161));
        pleventTitle.setText("Plevent");
        jPanel1.add(pleventTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 10, 170, 60));

        statisticsTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        statisticsTitle.setText("Consultas");
        jPanel1.add(statisticsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        publicEventsButton.setBackground(new java.awt.Color(132, 116, 161));
        publicEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        publicEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        publicEventsButton.setText("Eventos públicos");
        publicEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        publicEventsButton.setPreferredSize(new java.awt.Dimension(230, 40));
        publicEventsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                publicEventsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(publicEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        reviewsXEventButton.setBackground(new java.awt.Color(132, 116, 161));
        reviewsXEventButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        reviewsXEventButton.setForeground(new java.awt.Color(255, 255, 255));
        reviewsXEventButton.setText("Reseñas por evento");
        reviewsXEventButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reviewsXEventButton.setPreferredSize(new java.awt.Dimension(230, 40));
        reviewsXEventButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reviewsXEventButtonMouseClicked(evt);
            }
        });
        jPanel1.add(reviewsXEventButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        invitationsButton.setBackground(new java.awt.Color(132, 116, 161));
        invitationsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        invitationsButton.setForeground(new java.awt.Color(255, 255, 255));
        invitationsButton.setText("Invitaciones");
        invitationsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invitationsButton.setPreferredSize(new java.awt.Dimension(230, 40));
        invitationsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invitationsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(invitationsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        invitedUsersButton.setBackground(new java.awt.Color(132, 116, 161));
        invitedUsersButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        invitedUsersButton.setForeground(new java.awt.Color(255, 255, 255));
        invitedUsersButton.setText("Usuarios invitados");
        invitedUsersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invitedUsersButton.setPreferredSize(new java.awt.Dimension(230, 40));
        invitedUsersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invitedUsersButtonMouseClicked(evt);
            }
        });
        jPanel1.add(invitedUsersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        pastEventsButton.setBackground(new java.awt.Color(132, 116, 161));
        pastEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pastEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        pastEventsButton.setText("Eventos realizados");
        pastEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pastEventsButton.setPreferredSize(new java.awt.Dimension(230, 40));
        pastEventsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastEventsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(pastEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        assistEventsButton.setBackground(new java.awt.Color(132, 116, 161));
        assistEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        assistEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        assistEventsButton.setText("Eventos a los que asistí");
        assistEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assistEventsButton.setPreferredSize(new java.awt.Dimension(230, 40));
        assistEventsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assistEventsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(assistEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        futureEventsButton.setBackground(new java.awt.Color(132, 116, 161));
        futureEventsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        futureEventsButton.setForeground(new java.awt.Color(255, 255, 255));
        futureEventsButton.setText("Eventos próximos");
        futureEventsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        futureEventsButton.setPreferredSize(new java.awt.Dimension(230, 40));
        futureEventsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                futureEventsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(futureEventsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

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

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindowMouseClicked
        this.setVisible(false);
        UserWindow userW = new UserWindow();
    }//GEN-LAST:event_closeWindowMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(queriesWindow.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void invitedUsersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invitedUsersButtonMouseClicked
        this.setVisible(false);
        InvitedUsersWindow invitedU = new InvitedUsersWindow(this);
    }//GEN-LAST:event_invitedUsersButtonMouseClicked

    private void pastEventsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastEventsButtonMouseClicked
        this.setVisible(false);
        FinishedEventsWindow finisgE = new FinishedEventsWindow(this);
    }//GEN-LAST:event_pastEventsButtonMouseClicked

    private void futureEventsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_futureEventsButtonMouseClicked
        this.setVisible(false);
        PendingEventsWindow pendingE = new PendingEventsWindow(this);
    }//GEN-LAST:event_futureEventsButtonMouseClicked

    private void publicEventsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publicEventsButtonMouseClicked
        this.setVisible(false);
        PublicEventsWindow publicE = new PublicEventsWindow(this);
    }//GEN-LAST:event_publicEventsButtonMouseClicked

    private void reviewsXEventButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewsXEventButtonMouseClicked
        this.setVisible(false);
        EventReviewsWindow eventR = new EventReviewsWindow(this);
    }//GEN-LAST:event_reviewsXEventButtonMouseClicked

    private void invitationsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invitationsButtonMouseClicked
        this.setVisible(false);
        UserInvitationsWindow userI = new UserInvitationsWindow(this);
    }//GEN-LAST:event_invitationsButtonMouseClicked

    private void assistEventsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assistEventsButtonMouseClicked
        this.setVisible(false);
        AssistedEventsWindow assiE = new AssistedEventsWindow(this);
    }//GEN-LAST:event_assistEventsButtonMouseClicked

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
            java.util.logging.Logger.getLogger(queriesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(queriesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(queriesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(queriesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new queriesWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assistEventsButton;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JButton futureEventsButton;
    private javax.swing.JButton invitationsButton;
    private javax.swing.JButton invitedUsersButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton pastEventsButton;
    private javax.swing.JLabel pleventTitle;
    private javax.swing.JButton publicEventsButton;
    private javax.swing.JButton reviewsXEventButton;
    private javax.swing.JLabel statisticsTitle;
    // End of variables declaration//GEN-END:variables
}
