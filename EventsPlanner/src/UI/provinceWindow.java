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
public class provinceWindow extends javax.swing.JFrame {

    /**
     * Creates new form provinceWindow
     */
    cataloguesWindow cataW;
    public provinceWindow(cataloguesWindow cW) {
        initComponents();
        cataW = cW;
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
        addTitle = new javax.swing.JLabel();
        chooseCountry3 = new javax.swing.JLabel();
        modifyProvince = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        eliminateTitle = new javax.swing.JLabel();
        chooseCountry = new javax.swing.JLabel();
        newProvince = new javax.swing.JLabel();
        eliminateButton = new javax.swing.JButton();
        modifyTitle = new javax.swing.JLabel();
        iconProvince = new javax.swing.JLabel();
        chooseCountry2 = new javax.swing.JLabel();
        eliminateProvince = new javax.swing.JLabel();
        newName = new javax.swing.JLabel();
        modifyButton = new javax.swing.JButton();
        modifyProvinceComboBox = new javax.swing.JComboBox<>();
        chooseCComboBox3 = new javax.swing.JComboBox<>();
        newProvinceField = new javax.swing.JTextField();
        chooseCComboBox1 = new javax.swing.JComboBox<>();
        chooseCComboBox2 = new javax.swing.JComboBox<>();
        eliminateProvinceComboBox2 = new javax.swing.JComboBox<>();
        newNameField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addTitle.setText("Agregar");
        jPanel1.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        chooseCountry3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCountry3.setText("Elegir país");
        jPanel1.add(chooseCountry3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, 20));

        modifyProvince.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modifyProvince.setText("Provincia a modificar");
        jPanel1.add(modifyProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        addButton.setBackground(new java.awt.Color(8, 151, 157));
        addButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Agregar");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setMaximumSize(new java.awt.Dimension(89, 25));
        addButton.setPreferredSize(new java.awt.Dimension(89, 25));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 120, -1, -1));

        eliminateTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eliminateTitle.setText("Eliminar");
        jPanel1.add(eliminateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        chooseCountry.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCountry.setText("Elegir país");
        jPanel1.add(chooseCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        newProvince.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newProvince.setText("Nueva provincia");
        jPanel1.add(newProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        eliminateButton.setBackground(new java.awt.Color(8, 151, 157));
        eliminateButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminateButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminateButton.setText("Eliminar");
        eliminateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminateButton.setMaximumSize(new java.awt.Dimension(89, 25));
        eliminateButton.setPreferredSize(new java.awt.Dimension(89, 25));
        eliminateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminateButtonMouseClicked(evt);
            }
        });
        jPanel1.add(eliminateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 280, -1, -1));

        modifyTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modifyTitle.setText("Modificar");
        jPanel1.add(modifyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        iconProvince.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconProvince.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/province.png"))); // NOI18N
        jPanel1.add(iconProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, 80));

        chooseCountry2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCountry2.setText("Elegir país");
        jPanel1.add(chooseCountry2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 20));

        eliminateProvince.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminateProvince.setText("Provincia a eliminar");
        jPanel1.add(eliminateProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        newName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newName.setText("Nuevo nombre");
        jPanel1.add(newName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        modifyButton.setBackground(new java.awt.Color(8, 151, 157));
        modifyButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modifyButton.setForeground(new java.awt.Color(255, 255, 255));
        modifyButton.setText("Modificar");
        modifyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyButtonMouseClicked(evt);
            }
        });
        jPanel1.add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 500, -1, -1));

        modifyProvinceComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        modifyProvinceComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(modifyProvinceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, -1));

        chooseCComboBox3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(chooseCComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 130, -1));

        newProvinceField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(newProvinceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, -1));

        chooseCComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(chooseCComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, 21));

        chooseCComboBox2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(chooseCComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, -1));

        eliminateProvinceComboBox2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminateProvinceComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(eliminateProvinceComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 130, -1));

        newNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        newNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(newNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 130, 21));

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
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        cataW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addButtonMouseClicked

    private void eliminateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminateButtonMouseClicked
        cataW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eliminateButtonMouseClicked

    private void modifyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyButtonMouseClicked
        cataW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modifyButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        cataW.setVisible(true);
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
            java.util.logging.Logger.getLogger(provinceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(provinceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(provinceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(provinceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addTitle;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> chooseCComboBox1;
    private javax.swing.JComboBox<String> chooseCComboBox2;
    private javax.swing.JComboBox<String> chooseCComboBox3;
    private javax.swing.JLabel chooseCountry;
    private javax.swing.JLabel chooseCountry2;
    private javax.swing.JLabel chooseCountry3;
    private javax.swing.JButton eliminateButton;
    private javax.swing.JLabel eliminateProvince;
    private javax.swing.JComboBox<String> eliminateProvinceComboBox2;
    private javax.swing.JLabel eliminateTitle;
    private javax.swing.JLabel iconProvince;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel modifyProvince;
    private javax.swing.JComboBox<String> modifyProvinceComboBox;
    private javax.swing.JLabel modifyTitle;
    private javax.swing.JLabel newName;
    private javax.swing.JTextField newNameField;
    private javax.swing.JLabel newProvince;
    private javax.swing.JTextField newProvinceField;
    // End of variables declaration//GEN-END:variables
}
