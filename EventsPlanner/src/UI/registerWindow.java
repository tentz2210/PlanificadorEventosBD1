/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.placeholder.PlaceHolder;
import java.awt.Font;

/**
 *
 * @author mapac
 */
public class registerWindow extends javax.swing.JFrame {

    /**
     * Creates new form registerWindow
     */
    public registerWindow() {
        initComponents();
        this.holders();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void holders(){
        PlaceHolder holder;
        holder = new PlaceHolder(nameField,"Nombre");
        holder = new PlaceHolder(fLastNameField,"Primer Apellido");
        holder = new PlaceHolder(sLastNameField,"Segundo Apellido");
        holder = new PlaceHolder(identificationField,"Cédula o pasaporte");
        holder = new PlaceHolder(phoneField,"Número de teléfono");
        holder = new PlaceHolder(emailField,"Correo electrónico");
        holder = new PlaceHolder(userNameField,"Nombre de usuario");
        holder = new PlaceHolder(passwordField,"Contraseña");
        holder = new PlaceHolder(cPasswordField,"Contraseña");
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
        jPanel2 = new javax.swing.JPanel();
        pleventTitle = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        createAccount = new javax.swing.JLabel();
        identificationField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        fLastNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        sLastNameField = new javax.swing.JTextField();
        userNameField = new javax.swing.JTextField();
        dateOfBirthLabel = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        Month = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        Year = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        phoneField = new javax.swing.JTextField();
        cPasswordField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();
        userTypeLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        photoLabel = new javax.swing.JLabel();
        photoButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(8, 151, 157));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pleventTitle.setFont(new java.awt.Font("Edwardian Script ITC", 0, 65)); // NOI18N
        pleventTitle.setForeground(new java.awt.Color(255, 255, 255));
        pleventTitle.setText("Plevent");
        jPanel2.add(pleventTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 170, 60));

        d1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        d1.setForeground(new java.awt.Color(255, 255, 255));
        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setText("¿Ya estás registrado en Plevent?");
        jPanel2.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 230, 20));

        d2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        d2.setForeground(new java.awt.Color(255, 255, 255));
        d2.setText("Inicia sesión aquí");
        jPanel2.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 150, -1, -1));

        loginButton.setBackground(new java.awt.Color(5, 91, 92));
        loginButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setLabel("Iniciar sesión");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 40));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_pequeño.png"))); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 330, 290));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        createAccount.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        createAccount.setText("Crea una cuenta");
        jPanel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 220, 30));
        jPanel1.add(identificationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 125, 200, 30));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 200, 30));
        jPanel1.add(fLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 200, 30));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 200, 30));
        jPanel1.add(sLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 125, 200, 30));
        jPanel1.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 200, 30));

        dateOfBirthLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateOfBirthLabel.setText("Fecha de nacimiento");
        jPanel1.add(dateOfBirthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 140, 30));

        Day.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Day.setText("Día");
        jPanel1.add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        dayComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dayComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 255, -1, -1));

        Month.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Month.setText("Mes");
        jPanel1.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        monthComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 255, -1, -1));

        Year.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Year.setText("Año");
        jPanel1.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        yearComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1993", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));
        jPanel1.add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 255, -1, -1));
        jPanel1.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 200, 30));
        jPanel1.add(cPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 345, 200, 30));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 345, 200, 30));

        userTypeLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userTypeLabel.setText("Tipo de usuario ");
        jPanel1.add(userTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        userTypeComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(userTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 395, 120, -1));

        photoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camera.png"))); // NOI18N
        jPanel1.add(photoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 446, -1, -1));

        photoButton.setBackground(new java.awt.Color(132, 116, 161));
        photoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        photoButton.setForeground(new java.awt.Color(255, 255, 255));
        photoButton.setText("Foto");
        photoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(photoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 130, 30));

        registerButton.setBackground(new java.awt.Color(8, 151, 157));
        registerButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Registrarse");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        this.setVisible(false);
        loginWindow login = new loginWindow();
    }//GEN-LAST:event_loginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(registerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Day;
    private javax.swing.JLabel Month;
    private javax.swing.JLabel Year;
    private javax.swing.JPasswordField cPasswordField;
    private javax.swing.JLabel createAccount;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fLastNameField;
    private javax.swing.JTextField identificationField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton photoButton;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel pleventTitle;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField sLastNameField;
    private javax.swing.JTextField userNameField;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
