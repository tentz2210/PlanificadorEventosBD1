/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static DBConnection.MySQLConnection.loadUserTypes;
import static DBConnection.MySQLConnection.updateUserType;
import Utils.Global;
import javax.swing.JOptionPane;

/**
 *
 * @author mapac
 */
public class userTypeWindow extends javax.swing.JFrame {

    /**
     * Creates new form userTypeWindow
     */
    editProfile editP;
    public userTypeWindow(editProfile ew) {
        Global.userTypesInfo.clear();
        initComponents();
        editP = ew;
        fillUserTypeComboBox();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void fillUserTypeComboBox()
    {
        loadUserTypes();
        if (Global.getInfo_result == 1)
        {
            userTypeComboBox.removeAllItems();
            for (int uTypeNumber = 0; uTypeNumber < Global.userTypesInfo.size(); uTypeNumber++)
            {
                userTypeComboBox.addItem(Global.userTypesInfo.get(uTypeNumber).getName());
            }
        }
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
        userTypeTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTypeTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userTypeTitle.setText("Elegir tipo de usuario");
        jPanel1.add(userTypeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userType.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 80, 80));

        userTypeComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userTypeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(userTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        cancelButton.setBackground(new java.awt.Color(132, 116, 161));
        cancelButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancelar");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        acceptButton.setBackground(new java.awt.Color(8, 151, 157));
        acceptButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        acceptButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptButton.setText("Aceptar");
        acceptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acceptButton.setPreferredSize(new java.awt.Dimension(89, 25));
        acceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButtonMouseClicked(evt);
            }
        });
        jPanel1.add(acceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButtonMouseClicked
        int id_userType = Global.userTypesInfo.get(userTypeComboBox.getSelectedIndex()).getId();
        updateUserType(Global.user_id,id_userType);
        if (Global.update_result == 1) 
        {
            JOptionPane.showMessageDialog(this,"Tipo de usuario modificado correctamente","Modificación exitosa",JOptionPane.INFORMATION_MESSAGE);
            Global.user_type_id = id_userType;
        }
        else JOptionPane.showMessageDialog(this,"No se ha modificado el tipo de usuario","Error de modificación",JOptionPane.ERROR_MESSAGE);
            
        editP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_acceptButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        editP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void userTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeComboBoxActionPerformed
        if ("Administrador".equals(Global.userTypesInfo.get(userTypeComboBox.getSelectedIndex()).getName()))
        {   
            String code = JOptionPane.showInputDialog(this,"Digite el código para registrar administrador","Código de acceso",JOptionPane.QUESTION_MESSAGE);
            if (code == null) userTypeComboBox.setSelectedIndex(0);
            else if (!"151622".equals(code))
            {
                JOptionPane.showMessageDialog(this,"Código incorrecto.","Error",JOptionPane.INFORMATION_MESSAGE);
                userTypeComboBox.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_userTypeComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JLabel userTypeTitle;
    // End of variables declaration//GEN-END:variables
}
