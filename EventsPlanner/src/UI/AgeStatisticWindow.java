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
import AppPackage.AnimationClass;
import com.sun.javafx.application.PlatformImpl;
import java.awt.BorderLayout;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javax.swing.GroupLayout.Group;
import Utils.*;
import DBConnection.*;
public class AgeStatisticWindow extends javax.swing.JFrame {

    /**
     * Creates new form citizenWindow
     */
    statisticsWindow staW;
    public AgeStatisticWindow(statisticsWindow sW) {
        initComponents();
        staW = sW;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        final JFXPanel panel = new JFXPanel();
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
        minimize = new javax.swing.JLabel();
        closeWindow = new javax.swing.JLabel();
        chartPanel = new javax.swing.JPanel();
        queryButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(579, 658));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(579, 654));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        closeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/closeWindow.png"))); // NOI18N
        closeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindowMouseClicked(evt);
            }
        });
        jPanel1.add(closeWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        chartPanel.setBackground(new java.awt.Color(255, 255, 255));
        chartPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chartPanel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(chartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 480));

        queryButton.setBackground(new java.awt.Color(8, 151, 157));
        queryButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        queryButton.setForeground(new java.awt.Color(255, 255, 255));
        queryButton.setText("Consultar");
        queryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(queryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Estadísticas por edad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(loginWindow.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindowMouseClicked
        staW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_closeWindowMouseClicked

    private void queryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButtonActionPerformed
        generateAgeChart();
    }//GEN-LAST:event_queryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AgeStatisticWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgeStatisticWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgeStatisticWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgeStatisticWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    
    private Scene setChartScene(PieChart chart)
    {
        ScrollPane sp = new ScrollPane();
        sp.setContent(chart);
        
        Scene scene = new Scene(sp, 1050, 500);
        return scene;
    }
    
    private void generateChart(ResultSet r) throws SQLException
    {
        ArrayList<PieChart.Data> pieChartDataList = new ArrayList<PieChart.Data>();
        DecimalFormat dblFormat = new DecimalFormat("#.##");
        while(r.next())
        {
            String percentage = dblFormat.format(r.getDouble(3));
            String dataLabel = r.getString(1)+": "+r.getInt(2)+"/"+percentage+"%";
            pieChartDataList.add(new PieChart.Data(dataLabel, r.getInt(2)));
        }
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(pieChartDataList);
        
        
        final JFXPanel fxPanel = new JFXPanel();
        final PieChart chart = new PieChart(pieChartData);
        chart.setLabelsVisible(false);
        fxPanel.setScene(setChartScene(chart));
        this.chartPanel.removeAll();
        this.chartPanel.add(fxPanel, BorderLayout.CENTER);
        this.chartPanel.repaint();
    }
    
    private static void initFX(JFXPanel fxPanel, Scene scene) {
             // This method is invoked on JavaFX thread
             fxPanel.setScene(scene);
    }
    
    private void generateAgeChart()
    {
        final String DB_URL =
            "jdbc:mysql://localhost:3306/eventsproject";
        final String DB_USER = "root";
        final String DB_PASSWD = "Mpca1606";
        try {
            ResultSet r = null;
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            CallableStatement stmt = con.prepareCall("{call getStatisticsUsersAge()}");
            r = stmt.executeQuery();
            generateChart(r);
        } catch (SQLException ex) {
            Logger.getLogger(AgeStatisticWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartPanel;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton queryButton;
    // End of variables declaration//GEN-END:variables
}
