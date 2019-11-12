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
public class nameWindow extends javax.swing.JFrame {

    /**
     * Creates new form nameWindow
     */
    editProfile editP;
    public nameWindow(editProfile ew) {
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
        nameLabel = new javax.swing.JLabel();
        fLastName = new javax.swing.JLabel();
        sLastName = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        sLastNameField = new javax.swing.JTextField();
        fLastNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setText("Cambiar nombre");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        fLastName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fLastName.setText("Cambiar primer apellido");
        jPanel1.add(fLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        sLastName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sLastName.setText("Cambiar segundo apellido");
        jPanel1.add(sLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, -1));

        nameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nameField.setPreferredSize(new java.awt.Dimension(120, 21));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 17, -1, -1));

        sLastNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sLastNameField.setPreferredSize(new java.awt.Dimension(120, 21));
        jPanel1.add(sLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 103, -1, -1));

        fLastNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fLastNameField.setPreferredSize(new java.awt.Dimension(120, 21));
        jPanel1.add(fLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userName.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 70, 100));

        cancelButton.setBackground(new java.awt.Color(132, 116, 161));
        cancelButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancelar");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setPreferredSize(new java.awt.Dimension(90, 25));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 90, -1));

        acceptButton.setBackground(new java.awt.Color(8, 151, 157));
        acceptButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        acceptButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acceptButton.setLabel("Aceptar");
        acceptButton.setPreferredSize(new java.awt.Dimension(90, 25));
        acceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButtonMouseClicked(evt);
            }
        });
        jPanel1.add(acceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        editP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButtonMouseClicked
        String name = nameField.getText();
        String firstLName = fLastNameField.getText();
        String secLName = sLastNameField.getText();
     /*  if(!"".equals(name) && !Global.hasNumbers(name))
       {
           updatePerson(Global.person_id,name,firstLName,secLName,0,"","");
           if (Global.update_result==1) JOptionPane.showMessageDialog(this, "El nombre ha sido actualizado","Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
           else JOptionPane.showMessageDialog(this, "No es posible modificar el nombre","Error de cambio", JOptionPane.ERROR_MESSAGE);
       }
       else JOptionPane.showMessageDialog(this, "No es posible modificar el nombre","Error de cambio", JOptionPane.ERROR_MESSAGE);
       nameField.setText("");
       fLastNameField.setText("");
       sLastNameField.setText("");*/
       editP.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_acceptButtonMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel fLastName;
    private javax.swing.JTextField fLastNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel sLastName;
    private javax.swing.JTextField sLastNameField;
    // End of variables declaration//GEN-END:variables
}
