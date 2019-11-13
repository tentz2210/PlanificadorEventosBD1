/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static DBConnection.MySQLConnection.deleteCanton;
import static DBConnection.MySQLConnection.insertNewCanton;
import static DBConnection.MySQLConnection.loadCantons;
import static DBConnection.MySQLConnection.loadCountries;
import static DBConnection.MySQLConnection.loadProvinces;
import static DBConnection.MySQLConnection.updateCanton;
import Utils.Global;
import javax.swing.JOptionPane;

/**
 *
 * @author mapac
 */
public class cantonWindow extends javax.swing.JFrame {

    /**
     * Creates new form cantonWindow
     */
    cataloguesWindow cataW;
    public cantonWindow(cataloguesWindow cW) {
        Global.countriesInfo.clear();
        initComponents();
        fillCountriesComboBox();
        cataW = cW;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void fillCountriesComboBox()
    {
        loadCountries();
        if (Global.getInfo_result == 1)
        {
            chooseCountry1.removeAllItems();
            chooseCountry2.removeAllItems();
            chooseCountry3.removeAllItems();
            for (int countryNumber = 0; countryNumber < Global.countriesInfo.size(); countryNumber++)
            {
                chooseCountry1.addItem(Global.countriesInfo.get(countryNumber).getName());
                chooseCountry2.addItem(Global.countriesInfo.get(countryNumber).getName());
                chooseCountry3.addItem(Global.countriesInfo.get(countryNumber).getName());
            }
        }
    }
    
    private void fillProvincesComboBox1(int country_id)
    {
        Global.provincesInfo.clear();
        loadProvinces(country_id);
        if (Global.getInfo_result == 1)
        {
            chooseProvince1.removeAllItems();
            for (int provinceNumber = 0; provinceNumber < Global.provincesInfo.size(); provinceNumber++)
            {
                chooseProvince1.addItem(Global.provincesInfo.get(provinceNumber).getName());
            }
        }
    }
    
    private void fillProvincesComboBox2(int country_id)
    {
        Global.provincesInfo.clear();
        loadProvinces(country_id);
        if (Global.getInfo_result == 1)
        {
            chooseProvince2.removeAllItems();
            for (int provinceNumber = 0; provinceNumber < Global.provincesInfo.size(); provinceNumber++)
            {
                chooseProvince2.addItem(Global.provincesInfo.get(provinceNumber).getName());
            }
        }
    }
    
    private void fillProvincesComboBox3(int country_id)
    {
        Global.provincesInfo.clear();
        loadProvinces(country_id);
        if (Global.getInfo_result == 1)
        {
            chooseProvince3.removeAllItems();
            for (int provinceNumber = 0; provinceNumber < Global.provincesInfo.size(); provinceNumber++)
            {
                chooseProvince3.addItem(Global.provincesInfo.get(provinceNumber).getName());
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
        addTitle = new javax.swing.JLabel();
        chooseCP = new javax.swing.JLabel();
        newCanton = new javax.swing.JLabel();
        eliminateTitle = new javax.swing.JLabel();
        chooseCP2 = new javax.swing.JLabel();
        eliminateCanton = new javax.swing.JLabel();
        modifyTitle = new javax.swing.JLabel();
        chooseCP3 = new javax.swing.JLabel();
        modifyCanton = new javax.swing.JLabel();
        newName = new javax.swing.JLabel();
        chooseCountry3 = new javax.swing.JComboBox<>();
        chooseProvince3 = new javax.swing.JComboBox<>();
        newCantonField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        chooseCountry1 = new javax.swing.JComboBox<>();
        chooseProvince1 = new javax.swing.JComboBox<>();
        eliminateButton = new javax.swing.JButton();
        chooseCountry2 = new javax.swing.JComboBox<>();
        chooseProvince2 = new javax.swing.JComboBox<>();
        eliminateCantonComboBox = new javax.swing.JComboBox<>();
        newNameField = new javax.swing.JTextField();
        modifyButton = new javax.swing.JButton();
        cantonIcon = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        modifyCantonComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addTitle.setText("Agregar");
        jPanel1.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        chooseCP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCP.setText("Elegir país y provincia");
        jPanel1.add(chooseCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 20));

        newCanton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newCanton.setText("Nueva cantón");
        jPanel1.add(newCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        eliminateTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eliminateTitle.setText("Eliminar");
        jPanel1.add(eliminateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        chooseCP2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCP2.setText("Elegir país y provincia");
        jPanel1.add(chooseCP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 140, 20));

        eliminateCanton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminateCanton.setText("Cantón a eliminar");
        jPanel1.add(eliminateCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        modifyTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modifyTitle.setText("Modificar");
        jPanel1.add(modifyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        chooseCP3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chooseCP3.setText("Elegir país y provincia");
        jPanel1.add(chooseCP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, 20));

        modifyCanton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modifyCanton.setText("Cantón a modificar");
        jPanel1.add(modifyCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        newName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newName.setText("Nuevo nombre");
        jPanel1.add(newName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        chooseCountry3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCountry3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCountry3.setPreferredSize(new java.awt.Dimension(130, 21));
        chooseCountry3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCountry3ActionPerformed(evt);
            }
        });
        jPanel1.add(chooseCountry3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, 21));

        chooseProvince3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseProvince3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseProvince3.setPreferredSize(new java.awt.Dimension(130, 21));
        chooseProvince3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseProvince3ActionPerformed(evt);
            }
        });
        jPanel1.add(chooseProvince3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 130, 21));

        newCantonField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        newCantonField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        newCantonField.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(newCantonField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, 21));

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
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 130, -1, -1));

        chooseCountry1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCountry1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCountry1.setPreferredSize(new java.awt.Dimension(130, 21));
        chooseCountry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCountry1ActionPerformed(evt);
            }
        });
        jPanel1.add(chooseCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 130, 21));

        chooseProvince1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseProvince1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseProvince1.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(chooseProvince1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 130, 21));

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
        jPanel1.add(eliminateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 290, -1, -1));

        chooseCountry2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseCountry2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseCountry2.setPreferredSize(new java.awt.Dimension(130, 21));
        chooseCountry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCountry2ActionPerformed(evt);
            }
        });
        jPanel1.add(chooseCountry2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 21));

        chooseProvince2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chooseProvince2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseProvince2.setPreferredSize(new java.awt.Dimension(130, 21));
        chooseProvince2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseProvince2ActionPerformed(evt);
            }
        });
        jPanel1.add(chooseProvince2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 130, 21));

        eliminateCantonComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminateCantonComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminateCantonComboBox.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(eliminateCantonComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        newNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(newNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 130, -1));

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
        jPanel1.add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 510, -1, -1));

        cantonIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/canton.png"))); // NOI18N
        cantonIcon.setToolTipText("");
        jPanel1.add(cantonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 80, 80));

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
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, -1, -1));

        modifyCantonComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        modifyCantonComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyCantonComboBox1.setPreferredSize(new java.awt.Dimension(130, 21));
        jPanel1.add(modifyCantonComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        int id_province= -1;
        if (chooseProvince1.getSelectedIndex()!=-1)
            id_province = Global.provincesInfo.get(chooseProvince1.getSelectedIndex()).getId();
        String newCantonName = newCantonField.getText();
        if (id_province!=-1 && !"".equals(newCantonName) && !Global.isNumeric(newCantonName) && !Global.hasNumbers(newCantonName))
        {
            insertNewCanton(id_province,newCantonName);
            if (Global.insert_result == 1) JOptionPane.showMessageDialog(this,"Nuevo cantón ha sido agregado al catálogo","Modificación exitosa",JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(this,"Error al insertar el cantón","Error de inserción",JOptionPane.ERROR_MESSAGE);
        }
        else JOptionPane.showMessageDialog(this,"Error al insertar el cantón","Error de inserción",JOptionPane.ERROR_MESSAGE);
        cataW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addButtonMouseClicked

    private void eliminateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminateButtonMouseClicked
        int id_province = -1;
        if (chooseProvince2.getSelectedIndex()!=-1)
            Global.provincesInfo.get(chooseProvince2.getSelectedIndex()).getId();
        String canton_name = "";
        int canton_id = -1;
        if (eliminateCantonComboBox.getSelectedIndex()!=-1)
        {
            canton_name = Global.cantonsInfo.get(eliminateCantonComboBox.getSelectedIndex()).getName();
            canton_id = Global.cantonsInfo.get(eliminateCantonComboBox.getSelectedIndex()).getId();
        }
        if (id_province!=-1 && canton_id != -1 && canton_name!="")
        {
            deleteCanton(id_province,canton_name,canton_id);
            if (Global.delete_result == 1) JOptionPane.showMessageDialog(this,"El cantón ha sido eliminado","Borrado exitoso",JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(this,"Error al eliminar el cantón","Error de borrado",JOptionPane.ERROR_MESSAGE);
        }
        else JOptionPane.showMessageDialog(this,"Error al eliminar el cantón","Error de borrado",JOptionPane.ERROR_MESSAGE);
        
        cataW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eliminateButtonMouseClicked

    private void modifyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyButtonMouseClicked
        int id_province = -1;
        if (chooseProvince3.getSelectedIndex()!=-1)
            id_province = Global.provincesInfo.get(chooseProvince3.getSelectedIndex()).getId();
        String canton_name = "";
        int canton_id = -1;
        if (modifyCantonComboBox1.getSelectedIndex()!=-1)
        {
            canton_name = Global.cantonsInfo.get(modifyCantonComboBox1.getSelectedIndex()).getName();
            canton_id = Global.cantonsInfo.get(modifyCantonComboBox1.getSelectedIndex()).getId();
        }
        String newCantonName = newNameField.getText();
        if (id_province!=-1 && canton_id!=-1 && !"".equals(canton_name) &&!"".equals(newCantonName) && !Global.isNumeric(newCantonName) && !Global.hasNumbers(newCantonName))
        {
            updateCanton(id_province,canton_name,canton_id,newCantonName);
            if (Global.update_result == 1) JOptionPane.showMessageDialog(this,"El nombre del cantón ha sido modificado","Modificación exitosa",JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(this,"Error al modificar el cantón","Error de modificación",JOptionPane.ERROR_MESSAGE);
        }
        else JOptionPane.showMessageDialog(this,"Error al modificar el cantón","Error de modificación",JOptionPane.ERROR_MESSAGE);
        
        cataW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modifyButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        cataW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void chooseCountry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCountry1ActionPerformed
        if (chooseCountry1.getSelectedItem() != null)
        fillProvincesComboBox1(Global.countriesInfo.get(chooseCountry1.getSelectedIndex()).getId());
    }//GEN-LAST:event_chooseCountry1ActionPerformed

    private void chooseCountry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCountry2ActionPerformed
        if (chooseCountry2.getSelectedItem() != null)
        fillProvincesComboBox2(Global.countriesInfo.get(chooseCountry2.getSelectedIndex()).getId());
    }//GEN-LAST:event_chooseCountry2ActionPerformed

    private void chooseCountry3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCountry3ActionPerformed
        if (chooseCountry3.getSelectedItem() != null)
        fillProvincesComboBox3(Global.countriesInfo.get(chooseCountry3.getSelectedIndex()).getId());
    }//GEN-LAST:event_chooseCountry3ActionPerformed

    private void chooseProvince2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseProvince2ActionPerformed
        if (chooseProvince2.getSelectedItem() != null)
        fillCantonsComboBox(Global.provincesInfo.get(chooseProvince2.getSelectedIndex()).getId());
    }//GEN-LAST:event_chooseProvince2ActionPerformed

    private void chooseProvince3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseProvince3ActionPerformed
        if (chooseProvince3.getSelectedItem() != null)
        fillCantonsComboBox1(Global.provincesInfo.get(chooseProvince3.getSelectedIndex()).getId());
    }//GEN-LAST:event_chooseProvince3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addTitle;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cantonIcon;
    private javax.swing.JLabel chooseCP;
    private javax.swing.JLabel chooseCP2;
    private javax.swing.JLabel chooseCP3;
    private javax.swing.JComboBox<String> chooseCountry1;
    private javax.swing.JComboBox<String> chooseCountry2;
    private javax.swing.JComboBox<String> chooseCountry3;
    private javax.swing.JComboBox<String> chooseProvince1;
    private javax.swing.JComboBox<String> chooseProvince2;
    private javax.swing.JComboBox<String> chooseProvince3;
    private javax.swing.JButton eliminateButton;
    private javax.swing.JLabel eliminateCanton;
    private javax.swing.JComboBox<String> eliminateCantonComboBox;
    private javax.swing.JLabel eliminateTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel modifyCanton;
    private javax.swing.JComboBox<String> modifyCantonComboBox1;
    private javax.swing.JLabel modifyTitle;
    private javax.swing.JLabel newCanton;
    private javax.swing.JTextField newCantonField;
    private javax.swing.JLabel newName;
    private javax.swing.JTextField newNameField;
    // End of variables declaration//GEN-END:variables

    private void fillCantonsComboBox(int id_province) {
        Global.cantonsInfo.clear();
        loadCantons(id_province);
        if (Global.getInfo_result == 1)
        {
            eliminateCantonComboBox.removeAllItems();
            for (int cantonNumber = 0; cantonNumber < Global.cantonsInfo.size(); cantonNumber++)
            {
                eliminateCantonComboBox.addItem(Global.cantonsInfo.get(cantonNumber).getName());
            }
        }
    }
    
    private void fillCantonsComboBox1(int id_province) {
        Global.cantonsInfo.clear();
        loadCantons(id_province);
        if (Global.getInfo_result == 1)
        {
            modifyCantonComboBox1.removeAllItems();
            for (int cantonNumber = 0; cantonNumber < Global.cantonsInfo.size(); cantonNumber++)
            {
                modifyCantonComboBox1.addItem(Global.cantonsInfo.get(cantonNumber).getName());
            }
        }
    }
}
