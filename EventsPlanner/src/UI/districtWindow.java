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
public class districtWindow extends javax.swing.JFrame {

    /**
     * Creates new form districtWindow
     */
    cataloguesWindow cataW;
    public districtWindow(cataloguesWindow cW) {
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
        chooseCPC = new javax.swing.JLabel();
        newDistrcit = new javax.swing.JLabel();
        eliminateTitle = new javax.swing.JLabel();
        chooseCPC2 = new javax.swing.JLabel();
        eliminateDistrict = new javax.swing.JLabel();
        modifyTitle = new javax.swing.JLabel();
        chooseCPC3 = new javax.swing.JLabel();
        modifyDistrictLabel = new javax.swing.JLabel();
        newNameLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        eliminateButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        chooseCanton2 = new javax.swing.JComboBox<>();
        chooseCountry3 = new javax.swing.JComboBox<>();
        chooseCanton3 = new javax.swing.JComboBox<>();
        chooseCountry1 = new javax.swing.JComboBox<>();
        chooseProvince1 = new javax.swing.JComboBox<>();
        chooseCanton1 = new javax.swing.JComboBox<>();
        chooseCountry2 = new javax.swing.JComboBox<>();
        chooseProvince2 = new javax.swing.JComboBox<>();
        chooseProvince3 = new javax.swing.JComboBox<>();
        newNameField = new javax.swing.JTextField();
        newDistrict = new javax.swing.JTextField();
        eliminateDistrictField = new javax.swing.JTextField();
        modifyDistrict = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(778, 587));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 587));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(783, 587));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addTitle.setText("Agregar");
        jPanel1.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        chooseCPC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCPC.setText("Elegir país, provincia y cantón");
        jPanel1.add(chooseCPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 20));

        newDistrcit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newDistrcit.setText("Nuevo distrito");
        jPanel1.add(newDistrcit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        eliminateTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eliminateTitle.setText("Eliminar");
        jPanel1.add(eliminateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        chooseCPC2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCPC2.setText("Elegir país, provincia y cantón");
        jPanel1.add(chooseCPC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, 20));

        eliminateDistrict.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminateDistrict.setText("Distrito a eliminar");
        jPanel1.add(eliminateDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        modifyTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modifyTitle.setText("Modificar");
        jPanel1.add(modifyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        chooseCPC3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCPC3.setText("Elegir país, provincia y cantón");
        jPanel1.add(chooseCPC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 190, 20));

        modifyDistrictLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modifyDistrictLabel.setText("Distrito a modificar");
        jPanel1.add(modifyDistrictLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        newNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newNameLabel.setText("Nuevo nombre");
        jPanel1.add(newNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        addButton.setBackground(new java.awt.Color(8, 151, 157));
        addButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Agregar");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setPreferredSize(new java.awt.Dimension(89, 25));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        eliminateButton.setBackground(new java.awt.Color(8, 151, 157));
        eliminateButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminateButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminateButton.setText("Eliminar");
        eliminateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminateButton.setPreferredSize(new java.awt.Dimension(89, 25));
        eliminateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminateButtonMouseClicked(evt);
            }
        });
        jPanel1.add(eliminateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

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
        jPanel1.add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

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
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, -1, -1));

        chooseCanton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCanton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCanton2.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseCanton2.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseCanton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        chooseCountry3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCountry3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCountry3.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseCountry3.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseCountry3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        chooseCanton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCanton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCanton3.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseCanton3.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseCanton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        chooseCountry1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCountry1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCountry1.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseCountry1.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 20));

        chooseProvince1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseProvince1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseProvince1.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseProvince1.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseProvince1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        chooseCanton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCanton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCanton1.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseCanton1.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseCanton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        chooseCountry2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCountry2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCountry2.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseCountry2.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseCountry2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        chooseProvince2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseProvince2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseProvince2.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseProvince2.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseProvince2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        chooseProvince3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseProvince3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseProvince3.setMinimumSize(new java.awt.Dimension(130, 21));
        chooseProvince3.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseProvince3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        newNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        newNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        newNameField.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(newNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        newDistrict.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        newDistrict.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        newDistrict.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(newDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        eliminateDistrictField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminateDistrictField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eliminateDistrictField.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(eliminateDistrictField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        modifyDistrict.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        modifyDistrict.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(modifyDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 130, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/district.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 110, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

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
            java.util.logging.Logger.getLogger(districtWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(districtWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(districtWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(districtWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addTitle;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel chooseCPC;
    private javax.swing.JLabel chooseCPC2;
    private javax.swing.JLabel chooseCPC3;
    private javax.swing.JComboBox<String> chooseCanton1;
    private javax.swing.JComboBox<String> chooseCanton2;
    private javax.swing.JComboBox<String> chooseCanton3;
    private javax.swing.JComboBox<String> chooseCountry1;
    private javax.swing.JComboBox<String> chooseCountry2;
    private javax.swing.JComboBox<String> chooseCountry3;
    private javax.swing.JComboBox<String> chooseProvince1;
    private javax.swing.JComboBox<String> chooseProvince2;
    private javax.swing.JComboBox<String> chooseProvince3;
    private javax.swing.JButton eliminateButton;
    private javax.swing.JLabel eliminateDistrict;
    private javax.swing.JTextField eliminateDistrictField;
    private javax.swing.JLabel eliminateTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JComboBox<String> modifyDistrict;
    private javax.swing.JLabel modifyDistrictLabel;
    private javax.swing.JLabel modifyTitle;
    private javax.swing.JLabel newDistrcit;
    private javax.swing.JTextField newDistrict;
    private javax.swing.JTextField newNameField;
    private javax.swing.JLabel newNameLabel;
    // End of variables declaration//GEN-END:variables
}
