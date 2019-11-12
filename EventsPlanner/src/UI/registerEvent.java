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
public class registerEvent extends javax.swing.JFrame {

    /**
     * Creates new form registerEvent
     */
    UserWindow userW;
    public registerEvent(UserWindow uW) {
        initComponents();
        userW = uW;
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

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        newEventTitle = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        descriptionField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        categoryLabel = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        publicRadioButton = new javax.swing.JRadioButton();
        privateRadioButton = new javax.swing.JRadioButton();
        startDateLabel = new javax.swing.JLabel();
        dayFLabel = new javax.swing.JLabel();
        dayFComboBox = new javax.swing.JComboBox<>();
        monthFLabel = new javax.swing.JLabel();
        monthFComboBox = new javax.swing.JComboBox<>();
        yearFLabel = new javax.swing.JLabel();
        yearFComboBox = new javax.swing.JComboBox<>();
        hourFLabel = new javax.swing.JLabel();
        hourFComboBox = new javax.swing.JComboBox<>();
        minutesFLabel = new javax.swing.JLabel();
        minutesFComboBox = new javax.swing.JComboBox<>();
        finishDateLabel = new javax.swing.JLabel();
        daySLabel = new javax.swing.JLabel();
        daySComboBox = new javax.swing.JComboBox<>();
        hourSLabel = new javax.swing.JLabel();
        hourSComboBox = new javax.swing.JComboBox<>();
        monthSLabel = new javax.swing.JLabel();
        monthSComboBox1 = new javax.swing.JComboBox<>();
        yearSLabel = new javax.swing.JLabel();
        yearSComboBox = new javax.swing.JComboBox<>();
        minutesSLabel = new javax.swing.JLabel();
        minutesSComboBox = new javax.swing.JComboBox<>();
        iconPhoto = new javax.swing.JLabel();
        photoButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        locationLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox<>();
        provinceLabel = new javax.swing.JLabel();
        provinceComboBox = new javax.swing.JComboBox<>();
        cantonLabel = new javax.swing.JLabel();
        cantonComboBox = new javax.swing.JComboBox<>();
        districtLabel = new javax.swing.JLabel();
        districtComboBox = new javax.swing.JComboBox<>();
        directionLabel = new javax.swing.JLabel();
        directionTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(830, 555));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newEventTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        newEventTitle.setText("Nueva propuesta ");
        jPanel1.add(newEventTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 40));

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setText("Nombre del evento");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 20));

        descriptionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descriptionLabel.setText("Descripción");
        jPanel1.add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        descriptionField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descriptionField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        descriptionField.setPreferredSize(new java.awt.Dimension(6, 25));
        jPanel1.add(descriptionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 117, 380, -1));

        nameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 67, 170, 25));

        categoryLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        categoryLabel.setText("Categoría");
        jPanel1.add(categoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        categoryComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        categoryComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(categoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 167, 130, 25));

        typeLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        typeLabel.setText("Tipo de evento");
        jPanel1.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        publicRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(publicRadioButton);
        publicRadioButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        publicRadioButton.setText("Público");
        publicRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        publicRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(publicRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, -1, -1));

        privateRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(privateRadioButton);
        privateRadioButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        privateRadioButton.setText("Privado");
        privateRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(privateRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 217, -1, -1));

        startDateLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        startDateLabel.setText("Fecha de inicio");
        jPanel1.add(startDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        dayFLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dayFLabel.setText("Día");
        jPanel1.add(dayFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 353, -1, -1));

        dayFComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dayFComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayFComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(dayFComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        monthFLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        monthFLabel.setText("Mes");
        jPanel1.add(monthFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 353, -1, -1));

        monthFComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        monthFComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo ", "Abril ", "Mayo", "Junio", "Juilio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        monthFComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(monthFComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 350, -1, -1));

        yearFLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        yearFLabel.setText("Año");
        jPanel1.add(yearFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 353, -1, -1));

        yearFComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        yearFComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        yearFComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(yearFComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        hourFLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hourFLabel.setText("HH");
        jPanel1.add(hourFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        hourFComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hourFComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        hourFComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(hourFComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 387, -1, -1));

        minutesFLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        minutesFLabel.setText("MM");
        jPanel1.add(minutesFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        minutesFComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        minutesFComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minutesFComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(minutesFComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 387, -1, -1));

        finishDateLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        finishDateLabel.setText("Fecha finalización");
        jPanel1.add(finishDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        daySLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        daySLabel.setText("Día");
        jPanel1.add(daySLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 273, -1, -1));

        daySComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        daySComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        daySComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(daySComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        hourSLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hourSLabel.setText("HH");
        jPanel1.add(hourSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        hourSComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hourSComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        hourSComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(hourSComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 307, -1, -1));

        monthSLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        monthSLabel.setText("Mes");
        jPanel1.add(monthSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 273, -1, -1));

        monthSComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        monthSComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo ", "Abril ", "Mayo", "Junio", "Juilio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        monthSComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(monthSComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 270, -1, -1));

        yearSLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        yearSLabel.setText("Año");
        jPanel1.add(yearSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 273, -1, -1));

        yearSComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        yearSComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        yearSComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(yearSComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        minutesSLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        minutesSLabel.setText("MM");
        jPanel1.add(minutesSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        minutesSComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        minutesSComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minutesSComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(minutesSComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 307, -1, -1));

        iconPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camera.png"))); // NOI18N
        jPanel1.add(iconPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 160, -1));

        photoButton.setBackground(new java.awt.Color(5, 91, 92));
        photoButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        photoButton.setForeground(new java.awt.Color(255, 255, 255));
        photoButton.setText("Seleccionar");
        photoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(photoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        acceptButton.setBackground(new java.awt.Color(8, 151, 157));
        acceptButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        acceptButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptButton.setText("Aceptar");
        acceptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButtonMouseClicked(evt);
            }
        });
        jPanel1.add(acceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 89, -1));

        cancelButton.setBackground(new java.awt.Color(132, 116, 161));
        cancelButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancelar");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        locationLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        locationLabel.setText("Localización");
        jPanel1.add(locationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 20));

        countryLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        countryLabel.setText("País");
        jPanel1.add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 433, -1, -1));

        countryComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        countryComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(countryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 105, -1));

        provinceLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        provinceLabel.setText("Provincia");
        jPanel1.add(provinceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 433, -1, -1));

        provinceComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        provinceComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(provinceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 430, 105, -1));

        cantonLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cantonLabel.setText("Cantón");
        jPanel1.add(cantonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 433, -1, -1));

        cantonComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cantonComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cantonComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 105, -1));

        districtLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        districtLabel.setText("Distrito");
        jPanel1.add(districtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 433, -1, -1));

        districtComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        districtComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(districtComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 430, 105, -1));

        directionLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        directionLabel.setText("Dirección");
        jPanel1.add(directionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 473, -1, -1));

        directionTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(directionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 350, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publicRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicRadioButtonActionPerformed

    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButtonMouseClicked
        userW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_acceptButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        userW.setVisible(true);
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
            java.util.logging.Logger.getLogger(registerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> cantonComboBox;
    private javax.swing.JLabel cantonLabel;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JComboBox<String> dayFComboBox;
    private javax.swing.JLabel dayFLabel;
    private javax.swing.JComboBox<String> daySComboBox;
    private javax.swing.JLabel daySLabel;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel directionLabel;
    private javax.swing.JTextField directionTextField;
    private javax.swing.JComboBox<String> districtComboBox;
    private javax.swing.JLabel districtLabel;
    private javax.swing.JLabel finishDateLabel;
    private javax.swing.JComboBox<String> hourFComboBox;
    private javax.swing.JLabel hourFLabel;
    private javax.swing.JComboBox<String> hourSComboBox;
    private javax.swing.JLabel hourSLabel;
    private javax.swing.JLabel iconPhoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JComboBox<String> minutesFComboBox;
    private javax.swing.JLabel minutesFLabel;
    private javax.swing.JComboBox<String> minutesSComboBox;
    private javax.swing.JLabel minutesSLabel;
    private javax.swing.JComboBox<String> monthFComboBox;
    private javax.swing.JLabel monthFLabel;
    private javax.swing.JComboBox<String> monthSComboBox1;
    private javax.swing.JLabel monthSLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel newEventTitle;
    private javax.swing.JButton photoButton;
    private javax.swing.JRadioButton privateRadioButton;
    private javax.swing.JComboBox<String> provinceComboBox;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JRadioButton publicRadioButton;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JComboBox<String> yearFComboBox;
    private javax.swing.JLabel yearFLabel;
    private javax.swing.JComboBox<String> yearSComboBox;
    private javax.swing.JLabel yearSLabel;
    // End of variables declaration//GEN-END:variables
}
